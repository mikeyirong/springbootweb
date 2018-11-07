package com.mike.service;

import com.mike.entity.User;

public interface UserService {
  User selectByid(String userId);
}
