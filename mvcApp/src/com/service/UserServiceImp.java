package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImp;
import com.dto.User;

public class UserServiceImp implements UserService{

	private UserDao userdao;
	public UserServiceImp() {
	
		userdao = new UserDaoImp();
	}

	@Override
	public int registerUser(User user) {
		
		return userdao.insertUser(user);
	}

	@Override
	public boolean login(User user) {
		
		return	userdao.login(user);
	}

}
