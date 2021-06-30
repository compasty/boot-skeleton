package com.bilitrend.boot.service;

import com.bilitrend.boot.model.BaseResult;

/**
 * @author yanhuai
 * @version $Id: SmsService.java, v 0.1 2021年03月29日 1:34 下午 yanhuai Exp $
 */
public interface SmsService {

    /**
     *
     * @return 消息ID
     */
    BaseResult<String> sendSms(String phoneNo, String content);

}