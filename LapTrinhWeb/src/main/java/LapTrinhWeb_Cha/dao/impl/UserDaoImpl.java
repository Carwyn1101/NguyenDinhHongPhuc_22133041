package LapTrinhWeb_Cha.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import LapTrinhWeb_Cha.configs.DatabaseConnection;
import LapTrinhWeb_Cha.dao.IUserDao;
import LapTrinhWeb_Cha.models.UserModel;

public class UserDaoImpl extends DatabaseConnection implements IUserDao {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UserModel> findAll() {
		String sql = "select * from Users";
		List<UserModel> list = new ArrayList<>();

		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new UserModel(rs.getString("email"), rs.getString("username"), rs.getString("fullname"),
						rs.getString("password"), rs.getString("avatar"), rs.getInt("roleid"), rs.getString("phone"),
						rs.getDate("createDate")));
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public UserModel findByID(int id) {

		return null;
	}

	@Override
	public void insert(UserModel user) {

		String sql = "INSERT INTO [Users](email, username, fullname, password, avatar, roleid, phone, createDate) VALUES (?,?,?,?,?,?,?,?)";
		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFullName());
			ps.setString(4, user.getPassWord());
			ps.setString(5, user.getAvatar());
			ps.setInt(6, user.getRoleid());
			ps.setString(7, user.getPhone());
			ps.setDate(8, user.getCreatedDate());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserModel get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findByUserName(String username) {
		String sql = "SELECT * FROM [Users] WHERE username = ? ";
		try {
			conn = DatabaseConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserModel user = new UserModel();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setPassWord(rs.getString("password"));
				user.setAvatar(rs.getString("avatar"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreatedDate(rs.getDate("createDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean checkExistEmail(String email) {
		boolean duplicate = false;
		String query = "select * from [Users] where email = ?";
		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}
		return duplicate;
	}

	@Override
	public boolean checkExistUsername(String username) {
		boolean duplicate = false;
		String query = "select * from [Users] where username = ?";
		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}
		return duplicate;
	}

	@Override
	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPassword(String username, String newPassword) throws SQLException {
	    String query = "UPDATE Users SET password = ? WHERE username = ?";
	    conn = super.getConnection();
	    ps = conn.prepareStatement(query);
	    ps.setString(1, newPassword);
	    ps.setString(2, username);
	    ps.executeUpdate();
	}
	public void updateUserProfile(UserModel user)
	{
		// SQL code to update user's profile
        String sql = "UPDATE Users SET fullname = ?, phone = ?, avatar = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getAvatar());
            ps.setInt(4, user.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
