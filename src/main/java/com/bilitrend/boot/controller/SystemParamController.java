package com.bilitrend.boot.controller;

import com.bilitrend.boot.controller.form.SystemParamForm;
import com.bilitrend.boot.model.BaseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanhuai
 * @version $Id: SystemParamController.java, v 0.1 2021年03月29日 10:54 上午 yanhuai Exp $
 */
@RestController
@RequestMapping("/api")
public class SystemParamController {


    public BaseResult<Long> addSystemParam(SystemParamForm form) {
        return null;
    }
}