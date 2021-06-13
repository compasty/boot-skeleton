package com.bilitrend.boot.service;

import org.springframework.security.core.userdetails.User;

import java.util.Optional;

/**
 * @author yanhuai
 * @version $Id: UserService.java, v 0.1 2021年03月29日 11:40 上午 yanhuai Exp $
 */
public interface UserService {

    /**
     * 基于用户名查找用户信息
     * @param username 用户名称
     * @return
     */
    Optional<User> queryByUsername(String username);

}