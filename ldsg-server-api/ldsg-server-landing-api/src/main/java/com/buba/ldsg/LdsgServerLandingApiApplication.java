package com.buba.ldsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class LdsgServerLandingApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LdsgServerLandingApiApplication.class,args);
    }
}
