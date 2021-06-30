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
 * @version $Id: User.java, v 0.1 2021年03月26日 6:47 下午 yanhuai Exp $
 */
@Entity
@Table(name = "t_user")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_status")
    private String userStatus;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "user_type")
    private String userType;

    @Column
    private String password;

}