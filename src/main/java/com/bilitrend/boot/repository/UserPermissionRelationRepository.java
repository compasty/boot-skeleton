package com.bilitrend.boot.repository;

import com.bilitrend.boot.entity.UserPermissionRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yanhuai
 * @version $Id: UserPermissionRelationRepository.java, v 0.1 2021年06月30日 8:21 下午 yanhuai Exp $
 */
@Repository
public interface UserPermissionRelationRepository extends JpaRepository<UserPermissionRelation, Long> {

    List<UserPermissionRelation> findByUserId(String userId);

    long countByPermissionCode(String permissionCode);
}