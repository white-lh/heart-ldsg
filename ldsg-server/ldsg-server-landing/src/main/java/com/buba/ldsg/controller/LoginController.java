package com.buba.ldsg.controller;

import com.buba.ldsg.pojo.User;
import com.buba.ldsg.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/toLogin")
    @ResponseBody
    public String toLogin(@RequestBody User user) {
        String s = loginService.toLogin(user);
        return s;
    }

    @RequestMapping("/toRegister")
    @ResponseBody
    public Boolean toRegister(@RequestBody User user) {
        Boolean aBoolean = loginService.toRegister(user);
        return aBoolean;
    }

}
