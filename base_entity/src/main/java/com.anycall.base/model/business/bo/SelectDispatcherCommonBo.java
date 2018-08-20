package com.anycall.base.model.business.bo;


import java.io.Serializable;

/**
 * Created by admin on 2016/7/29.
 */
public class SelectDispatcherCommonBo implements Serializable {

    private static final long serialVersionUID = 13599327777161723L;

    private Long dispatcherId;
    private String dispatcherName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public String getDispatcherName() {
        return dispatcherName;
    }

    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }
}
