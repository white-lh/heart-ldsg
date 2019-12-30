package com.buba.ldsg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class ZuulConfig {
    @Bean
    public CorsFilter corsFilter(){
        //配置初始化对象
        CorsConfiguration configuration=new CorsConfiguration();
        //允许跨域的域名，如果要携带cookie，不能写* 。  *：代表所有的域名都可以访问
        configuration.addAllowedOrigin("http://localhost:8080");
        configuration.setAllowCredentials(true);
        configuration.addAllowedMethod("*");            //代表所有的请求方法
        configuration.addAllowedHeader("*");        //允许携带任何头信息
        //初始化cors配置源对象
        UrlBasedCorsConfigurationSource configurationSource=new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",configuration);

        //返回corsFilter实例，参数:cors配置源对象
        return new CorsFilter(configurationSource);
    }
}
