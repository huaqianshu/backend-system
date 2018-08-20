package com.anycall.base.model.common;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by harold on  16/12/08.
 * Copyright © 2014-2016 ants-city.com
 */
public class Attention extends AbstractPersistable {

    private static final long serialVersionUID = 1695589895579553011L;

    // 提醒类型
    private AttentionType attentionType;

    // 提醒状态
    private Boolean attentionStatus;

    // 发起者
    private String founder;

    // 发起时间
    private Date foundTime;

    // 接收人id
    private Long receiverId;

    // 提醒内容
    private String attentionText;
    // 单子类型
    private OrderType orderType;
    // 单号
    private String orderNo;
    //是否过期
    private Boolean overdue=false;

    public Boolean getOverdue() {
        return overdue;
    }

    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public AttentionType getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(AttentionType attentionType) {
        this.attentionType = attentionType;
    }

    public Boolean getAttentionStatus() {
        return attentionStatus;
    }

    public void setAttentionStatus(Boolean attentionStatus) {
        this.attentionStatus = attentionStatus;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Date getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getAttentionText() {
        return attentionText;
    }

    public void setAttentionText(String attentionText) {
        this.attentionText = attentionText;
    }
}
