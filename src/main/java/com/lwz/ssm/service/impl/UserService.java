package com.lwz.ssm.service.impl;

import java.util.List;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwz.ssm.dao.UserDao;
import com.lwz.ssm.pojo.User;
import com.lwz.ssm.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	@Resource
	private UserDao userDao;
	
	public List<User> getAllUsers() {
		return userDao.getAllUser();
	}

}
