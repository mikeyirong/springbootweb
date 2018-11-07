package com.mike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mike.entity.User;
import com.mike.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService mUserService;
	@RequestMapping(value="/getUser/{userId}",method=RequestMethod.GET)
	public User getUser(@PathVariable Integer userId) {
		return mUserService.selectByid(userId+"");
	}
}
