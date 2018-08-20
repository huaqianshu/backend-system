package com.anycall.base.exception;

/**
 * Created by lujun on 2015/12/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class FieldInvalidException extends RuntimeException {

    private static final long serialVersionUID = 3636464051595648593L;

    private final String fieldName;
    private final String messageKey;

    public FieldInvalidException(String fieldName, String messageKey) {
        super();
        this.fieldName = fieldName;
        this.messageKey = messageKey;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessageKey() {
        return messageKey;
    }
}
