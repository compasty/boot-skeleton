package com.bilitrend.boot.service.impl;

import com.bilitrend.boot.common.ErrorCodes;
import com.bilitrend.boot.model.BaseResult;
import com.bilitrend.boot.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author yanhuai
 * @version $Id: SmsServiceImpl.java, v 0.1 2021年06月30日 8:32 下午 yanhuai Exp $
 */
@Slf4j
@Service
public class SmsServiceImpl implements SmsService {

    @Override
    public BaseResult<String> sendSms(String phoneNo, String content) {
        try {
            String messageId = UUID.randomUUID().toString().replace("-", "");
            return new BaseResult<>(true, messageId);
        } catch (Exception e) {
            log.error("Send sms,N,", e);
            return new BaseResult<>(ErrorCodes.COMMON_ERROR, e.getMessage());
        }

    }
}