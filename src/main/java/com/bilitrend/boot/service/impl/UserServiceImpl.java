package com.bilitrend.boot.service.impl;

import com.bilitrend.boot.repository.UserRepository;
import com.bilitrend.boot.service.UserService;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author yanhuai
 * @version $Id: UserServiceImpl.java, v 0.1 2021年03月29日 11:40 上午 yanhuai Exp $
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<User> queryByUsername(String username) {
        Preconditions.checkState(StringUtils.isNotEmpty(username), "Username is empty.");

        Optional<com.bilitrend.boot.entity.User> user = userRepository.findByUserName(username);


        return Optional.empty();
    }

    /**
     * Setter method for property <tt>userRepository</tt>.
     *
     * @param userRepository value to be assigned to property userRepository
     */
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}