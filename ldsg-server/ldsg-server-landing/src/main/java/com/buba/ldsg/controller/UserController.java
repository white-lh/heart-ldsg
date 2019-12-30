package com.buba.ldsg.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {


    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request){
        String loginSessionId = (String) request.getSession().getAttribute("loginSessionId");
        System.out.println(loginSessionId);
        return loginSessionId;
    }
}
