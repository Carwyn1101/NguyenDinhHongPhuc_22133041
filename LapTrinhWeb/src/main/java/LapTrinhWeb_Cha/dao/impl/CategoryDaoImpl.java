package LapTrinhWeb_Cha.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LapTrinhWeb_Cha.configs.DatabaseConnection;
import LapTrinhWeb_Cha.dao.ICategoryDao;
import LapTrinhWeb_Cha.models.CategoryModel;

public class CategoryDaoImpl extends DatabaseConnection implements ICategoryDao {

	@Override
	public void insert(CategoryModel category) {
		String sql = "INSERT INTO Category(cate_name,images) VALUES (?,?)";
		try {
		Connection con = super.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, category.getCatename());
		ps.setString(2, category.getImages());
		ps.executeUpdate();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	@Override
	public void edit(CategoryModel category) {
		String sql = "UPDATE Category SET cate_name = ?, images=? WHERE cate_id = ?";
		try {
		Connection con = super.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, category.getCatename());
		ps.setString(2, category.getImages());
		ps.setInt(3, category.getCateid());
		ps.executeUpdate();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM Category WHERE cate_id = ?";
		try {
		Connection con = super.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	@Override
	public CategoryModel get(int id) {
		String sql = "SELECT * FROM category WHERE cate_id = ? ";
		try {
		Connection con = super.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		CategoryModel category = new CategoryModel();
		category.setCateid(rs.getInt("cate_id"));
		category.setCatename(rs.getString("cate_name"));
		category.setImages(rs.getString("images"));
		return category;
		}} catch (Exception e) {
		e.printStackTrace();}
		return null;
	}

	@Override
	public CategoryModel get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryModel> getAll() {
		List<CategoryModel> categories = new ArrayList<CategoryModel>();
		String sql = "SELECT * FROM Category";
		try {
		Connection conn = super.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		CategoryModel category = new CategoryModel();
		category.setCateid(rs.getInt("cate_id"));
		category.setCatename(rs.getString("cate_name"));
		category.setImages(rs.getString("images"));
		categories.add(category);
		}} catch (Exception e) {
		e.printStackTrace();}
		return categories;
	}

	@Override
	public List<CategoryModel> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryModel> findByCategoryName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryModel> findAll() {
		List<CategoryModel> categories = new ArrayList<>();
		String sql = "SELECT * FROM Category";
		try {
			Connection conn = super.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModel category = new CategoryModel();
				category.setCateid(rs.getInt("cate_id"));
				category.setCatename(rs.getString("cate_name"));
				category.setImages(rs.getString("images"));
				category.setStatus(rs.getInt("status"));
				categories.add(category);
			}
			conn.close();
			ps.close();
			rs.close();
			return categories;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(CategoryModel category) {
		String sql = "UPDATE Category SET cate_name = ?, images = ?, status = ? WHERE cate_id = ?";
		try {
			Connection conn = super.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, category.getCatename());
			ps.setString(2, category.getImages());
			ps.setInt(3, category.getStatus());
			ps.setInt(4, category.getCateid());
			ps.executeUpdate();
			conn.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
