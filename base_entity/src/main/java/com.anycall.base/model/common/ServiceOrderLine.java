package com.anycall.base.model.common;


import java.io.Serializable;

/**
 * Created by Robin on 16/11/17.
 */
public class ServiceOrderLine implements Serializable {

    private static final long serialVersionUID = 5486392601739340540L;
    private Long orderId;
    private String orderNo;
    private String type;
    private String status;

    public ServiceOrderLine(){}

    public ServiceOrderLine( Long orderId, String orderNo, String type, String status) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.type = type;
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
