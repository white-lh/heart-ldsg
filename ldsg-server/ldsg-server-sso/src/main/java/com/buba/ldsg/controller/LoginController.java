package com.buba.ldsg.controller;

import com.buba.ldsg.pojo.User;
import com.buba.ldsg.service.LoginService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@RequestMapping("/sso")
public class LoginController {

    @Autowired
    private LoginService loginService;

    //判断是否登录
    @RequestMapping("/ifLogin")
    public Boolean hasKey(String key){
        Boolean bo = loginService.hasKey(key);
        return bo;
    }

    //登录的方法
    @RequestMapping("/login")
    @ResponseBody
    public String toLogin(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String s = loginService.toLogin(user, request, response);
        return s;
    }
}
