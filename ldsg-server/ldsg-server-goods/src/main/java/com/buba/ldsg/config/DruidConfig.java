package com.buba.ldsg.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DruidConfig {

    @Autowired
    public Environment env;

    @Bean
    public DataSource getDataSouce(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(env.getProperty("spring.datasource.url"));
        druidDataSource.setUsername(env.getProperty("spring.datasource.username"));
        druidDataSource.setPassword(env.getProperty("spring.datasource.password"));
        druidDataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        druidDataSource.setMaxActive(20); //连接池中最多支持多少个活动会话
        //缓存通过以下两个方法发起的SQL:
        //  public PreparedStatement prepareStatement(String sql)
        //  public PreparedStatement prepareStatement(String sql,
        druidDataSource.setPoolPreparedStatements(true);
        druidDataSource.setInitialSize(5); //启动程序时，在连接池中初始化多少个连接
        druidDataSource.setMinIdle(5);//回收空闲连接时，将保证至少有minIdle个连接.
        druidDataSource.setMaxWait(60000); //程序向连接池中请求连接时,超过maxWait的值后，认为本次请求失败
        druidDataSource.setMinEvictableIdleTimeMillis(300000);//检查空闲连接的频率，单位毫秒, 非正整数时表示不进行检查
        return druidDataSource;
    }
}
