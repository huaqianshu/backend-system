package com.anycall.base.exception;

/**
 * Created by Kevin on 2015/12/2.
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 4113421339501737900L;

    private String messageKey;
    private Object[] args;

    public BizException(String messageKey) {
        super();
        this.messageKey = messageKey;
    }

    public BizException(String messageKey, Object... args) {
        super();
        this.messageKey = messageKey;
        this.args = args;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}
