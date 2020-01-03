package com.buba.ldsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
public class LdsgPagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LdsgPagesApplication.class,args);
    }
}
