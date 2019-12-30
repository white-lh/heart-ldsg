package com.buba.ldsg.service.impl;

import com.buba.ldsg.mapper.LoginMapper;
import com.buba.ldsg.pojo.User;
import com.buba.ldsg.service.LoginService;
import com.buba.ldsg.util.TokenUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 判断key是否存在
     */
    public Boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 校验用户名密码，成功则返回通行令牌
     */
    public String toLogin(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //通行令牌token
        String token = "";
        //利用mapper去数据库查询出来登录的对象
        User user1 = loginMapper.toLogin(user);
        if (user1 == null) {
            //跳转到登陆界面
            response.sendRedirect("url");
        } else {
            token = TokenUtil.getToken();
            //令牌作为key，存用户id作为value（或者直接存储可暴露的部分用户信息也行）设置过期时间（我这里设置3分钟）
            redisTemplate.opsForValue().set(token,user1.getU_username(),(long) (3 * 60),TimeUnit.SECONDS);
        }

        return token;
    }

}
