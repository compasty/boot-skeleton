package com.bilitrend.boot.model;

import com.bilitrend.boot.common.ErrorCodes;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yanhuai
 * @version $Id: BaseResult.java, v 0.1 2021年03月29日 10:54 上午 yanhuai Exp $
 */
@Getter
@Setter
public class BaseResult<T> {

    private boolean success;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 错误码
     */
    private ErrorCodes errorCode;

    /**
     * 实际数据
     */
    private T data;

    public BaseResult() {
        this.success = false;
    }

    public BaseResult(ErrorCodes errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BaseResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }
}