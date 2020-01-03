package com.buba.ldsg.controller;

import com.buba.ldsg.feign.FeignLdsgLanding;
import com.buba.ldsg.pojo.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageController {

    @Autowired
    private FeignLdsgLanding ldsgLanding;

    @RequestMapping("/toLogin")
    public ModelAndView toLogin(User user, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        String s = ldsgLanding.toLogin(user);
        if (s.equals("mmcw") || s.equals("zzcw")) {
            mav.setViewName("login.html");
        } else {
            //将token存入session中
            request.getSession().setAttribute("token", s);
            //将token作为键，user作为值存入session中
            request.getSession().setAttribute(s, user);
            String url = (String) request.getSession().getAttribute("url");
            mav.getModel().put("token", s);
            mav.setViewName("index.html");
        }
        return mav;
    }
}
