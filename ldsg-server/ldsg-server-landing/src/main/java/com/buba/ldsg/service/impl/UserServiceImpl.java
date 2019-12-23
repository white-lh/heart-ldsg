package com.buba.ldsg.service.impl;

import com.buba.ldsg.mapper.UserMapper;
import com.buba.ldsg.pojo.User;
import com.buba.ldsg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User toLogin(User user) {
        return userMapper.toLogin(user);
    }
}
