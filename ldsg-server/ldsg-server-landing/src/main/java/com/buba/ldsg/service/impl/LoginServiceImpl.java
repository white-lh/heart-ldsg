package com.buba.ldsg.service.impl;

import com.buba.ldsg.mapper.LoginMapper;
import com.buba.ldsg.pojo.User;
import com.buba.ldsg.service.LoginService;
import com.buba.ldsg.util.MD5Util;
import com.buba.ldsg.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    /**
     * 校验用户名密码，成功则返回通行令牌
     */
    public String toLogin(User user) {
        //通行令牌token
        String token = "";
        //用mapper从数据库查询
        User user1 = loginMapper.toLogin(user);
        //验证用户名密码 是否正确
        if (user1 != null) {
            if (MD5Util.verify(user.getU_password(), user1.getU_password())) {
                token = TokenUtil.getToken();
                //令牌作为key，存用户加密后的string作为value设置过期时间（我这里设置3分钟）
            } else {
                //跳转到登陆界面返回密码错误
                return "mmcw";
            }
        } else {
            return "zzcw";
        }
        return token;
    }

    public Boolean toRegister(User user) {
        try {
            loginMapper.toRegister(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
