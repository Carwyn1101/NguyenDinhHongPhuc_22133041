package LapTrinhWeb_Cha.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import LapTrinhWeb_Cha.configs.DatabaseConnection;
import LapTrinhWeb_Cha.dao.impl.UserDaoImpl;
import LapTrinhWeb_Cha.models.UserModel;
import LapTrinhWeb_Cha.services.IUserService;

public class UserServiceImpl implements IUserService {

	UserDaoImpl userDao = new UserDaoImpl();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.findByUserName(username);
		if (user != null && user.getPassWord().equals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel get(String username) {

		return null;
	}

	public UserModel findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public void insert(UserModel user) {
		userDao.insert(user);

	}

	@Override
	public boolean register(String email, String password, String username, String fullname, String phone) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDao.insert(new UserModel(email, username, fullname, password, null, 1, phone, date));
		return true;
	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	@Override
	public void resetPassword(String username, String newPassword) throws Exception {
	    userDao.resetPassword(username, newPassword);	
	}
	
	public void updateUserProfile(UserModel user) {
		userDao.updateUserProfile(user);
    }
}
