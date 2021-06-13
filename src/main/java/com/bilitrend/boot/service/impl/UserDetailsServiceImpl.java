package com.bilitrend.boot.service.impl;

import com.bilitrend.boot.entity.User;
import com.bilitrend.boot.repository.UserRepository;
import com.bilitrend.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 用户权限等服务实现类
 *
 * @author yanhuai
 * @version $Id: UserDetailsServiceImpl.java, v 0.1 2021年03月29日 11:29 上午 yanhuai Exp $
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}