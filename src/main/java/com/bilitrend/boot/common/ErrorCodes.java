package com.bilitrend.boot.common;

/**
 * @author yanhuai
 * @version $Id: ErrorCodes.java, v 0.1 2021年06月30日 9:05 下午 yanhuai Exp $
 */
public enum ErrorCodes {

    COMMON_ERROR("SYSTEM", "common error");

    ErrorCodes(String domain, String message) {
        this.domain = domain;
        this.message = message;
    }

    private final String domain;

    private final String message;

    /**
     * Getter method for property <tt>domain</tt>.
     *
     * @return property value of domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Getter method for property <tt>message</tt>.
     *
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }
}