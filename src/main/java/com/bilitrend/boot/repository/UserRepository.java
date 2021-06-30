package com.bilitrend.boot.repository;

import com.bilitrend.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author yanhuai
 * @version $Id: UserRepository.java, v 0.1 2021年03月29日 10:58 上午 yanhuai Exp $
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserId(String userId);

    Optional<User> findByUserName(String userName);

}