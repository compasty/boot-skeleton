package com.bilitrend.boot.repository;

import com.bilitrend.boot.entity.UserRoleRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yanhuai
 * @version $Id: UserRoleRelationRepository.java, v 0.1 2021年06月30日 7:56 下午 yanhuai Exp $
 */
@Repository
public interface UserRoleRelationRepository extends JpaRepository<UserRoleRelation, Long> {

    List<UserRoleRelation> findByUserId(String userId);

    long countByRoleCode(String roleCode);
}