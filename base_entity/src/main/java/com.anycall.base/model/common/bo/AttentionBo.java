package com.anycall.base.model.common.bo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.common.Attention;
import com.anycall.base.model.common.AttentionType;

import java.util.Date;

/**
 * Created by harold on  16/12/08.
 * Copyright © 2014-2016 ants-city.com
 */
public class AttentionBo extends Attention {
    private static final long serialVersionUID = 5306970843625486331L;
    private String receiverName;
    private String serviceOrderStatus;
    private String workOrderStatus;

    public String getWorkOrderStatus() {
        return workOrderStatus;
    }

    public void setWorkOrderStatus(String workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
    }

    public String getServiceOrderStatus() {
        return serviceOrderStatus;
    }

    public void setServiceOrderStatus(String serviceOrderStatus) {
        this.serviceOrderStatus = serviceOrderStatus;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}
