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
 * @version $Id: SystemParam.java, v 0.1 2021年03月26日 6:48 下午 yanhuai Exp $
 */
@Entity
@Table(name = "t_system_param")
@Getter
@Setter
@NoArgsConstructor
public class SystemParam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    @Column(name = "type_code")
    private String typeCode;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "param_code")
    private String paramCode;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_value")
    private String paramValue;

    @Column
    private Integer order;

    @Column
    private String memo;

    @Column
    private String creator;

    @Column
    private String editor;
}