package com.mike.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mike.dao.UserDao;
import com.mike.entity.User;
import com.mike.service.UserService;
@Service
public class UserServiceImpl implements UserService {
  @Resource
   private UserDao mUserDao;
  
	@Override
	public User selectByid(String userId) {
		return mUserDao.selectByid(userId);
	}
}
