package com.buba.ldsg.service;

import com.buba.ldsg.pojo.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface LoginService {
    //判断key是否存在
    Boolean hasKey(String key);

    //登录
    String toLogin(User user, HttpServletRequest request, HttpServletResponse response) throws IOException;
}
