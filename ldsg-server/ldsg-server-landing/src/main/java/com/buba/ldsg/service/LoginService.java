package com.buba.ldsg.service;

import com.buba.ldsg.pojo.User;


public interface LoginService {
    //登陆方法
    String toLogin(User user);

    //注册方法
    Boolean toRegister(User user);
}
