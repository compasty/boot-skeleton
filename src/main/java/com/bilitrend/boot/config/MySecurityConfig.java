package com.bilitrend.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author yanhuai
 * @version $Id: MySecurityConfig.java, v 0.1 2021年03月29日 10:45 上午 yanhuai Exp $
 */
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO
        auth.jdbcAuthentication()
    }

    @Bean
    public void configure(HttpSecurity http) throws Exception {
        // 授权
        http.authorizeRequests()
                // 所有请求都必须认证才能访问，必须执行登录
                .anyRequest().authenticated();
        // 关闭csrf
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}