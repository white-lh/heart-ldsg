package com.buba.ldsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LdsgEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LdsgEurekaServerApplication.class,args);
    }
}
