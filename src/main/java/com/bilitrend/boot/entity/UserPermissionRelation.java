/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.bilitrend.boot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author yanhuai
 * @version $Id: UserPermissionRelation.java, v 0.1 2021年06月30日 8:17 下午 yanhuai Exp $
 */
@Entity
@Table(name = "t_user_permission_rel")
@Getter
@Setter
@NoArgsConstructor
public class UserPermissionRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "role_code")
    private String roleCode;
}