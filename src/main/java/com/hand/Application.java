package com.hand;

import com.alibaba.druid.pool.DruidDataSource;
import com.hand.api.controller.MyInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by chenjin on 2018/6/16.
 */
@MapperScan("com.hand.infra.mapper")
@SpringBootApplication
@ServletComponentScan
public class Application extends WebMvcConfigurerAdapter {
    @Autowired
    private Environment env;

    @Bean
    public DruidDataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("URL"));
        dataSource.setUsername(env.getProperty("USERNAME"));
        dataSource.setPassword(env.getProperty("PASSWORD"));
        dataSource.setDriverClassName(env.getProperty("DRIVERCLASSNAME"));
        return dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
