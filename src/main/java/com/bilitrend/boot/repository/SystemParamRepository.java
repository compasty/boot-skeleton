package com.bilitrend.boot.repository;

import com.bilitrend.boot.entity.SystemParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yanhuai
 * @version $Id: SystemParamRepository.java, v 0.1 2021年03月26日 7:47 下午 yanhuai Exp $
 */
@Repository
public interface SystemParamRepository extends JpaRepository<SystemParam, Long> {

    List<SystemParam> findByTypeCode(String typeCode);

    List<SystemParam> findByTypeCodeAndParamCode(String typeCode, String paramCode);
}