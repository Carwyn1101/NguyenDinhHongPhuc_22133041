package LapTrinhWeb_Cha.dao;

import java.sql.SQLException;
import java.util.List;

import LapTrinhWeb_Cha.models.UserModel;

public interface IUserDao {

	List<UserModel> findAll();

	UserModel findByID(int id);

	void insert(UserModel user);

	UserModel get(String username);

	public UserModel findByUserName(String username);

	boolean checkExistEmail(String email);

	boolean checkExistUsername(String username);

	boolean checkExistPhone(String phone);

	void resetPassword(String username, String newPassword) throws SQLException;

	void updateUserProfile(UserModel user);
}