package com.anycall.base.model.business.bo;

import java.io.Serializable;

/**
 * Created by Robin on 16/9/14.
 */
public class CommonKvBo implements Serializable{

    private static final long serialVersionUID = -2770577772630408442L;
    private String value;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CommonKvBo(String value, String id) {
        this.value = value;
        this.id = id;
    }
}
