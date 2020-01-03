package com.buba.ldsg.mapper;

import com.buba.ldsg.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    //登陆方法
    User toLogin(User user);

    //注册方法
    void toRegister(User user);
}
