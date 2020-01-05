package com.buba.ldsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.buba.ldsg.mapper")
public class LdsgServerPictureApplication {
    public static void main(String[] args) {
        SpringApplication.run(LdsgServerPictureApplication.class,args);
    }
}
