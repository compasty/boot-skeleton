package com.bilitrend.boot.repository;

import com.bilitrend.boot.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yanhuai
 * @version $Id: PermissionRepository.java, v 0.1 2021年06月30日 8:23 下午 yanhuai Exp $
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    List<Permission> findByPermissionCodeInAndStatus(List<String> permissionCodes, String status);

    Permission findByPermissionCode(String permissionCode);

}