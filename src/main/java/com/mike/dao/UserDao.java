package com.mike.dao;


import com.mike.entity.User;
public interface UserDao extends BaseDao<User>{
	void getUserList();
	User selectByid(String userId);
	User findByUsername(String username);
}
