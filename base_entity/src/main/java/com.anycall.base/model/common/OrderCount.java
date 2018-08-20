package com.anycall.base.model.common;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by harold on  16/12/26.
 * Copyright © 2014-2016 ants-city.com
 */
public class OrderCount extends AbstractPersistable {

    private static final long serialVersionUID = 7389475130946333802L;

    // 身份类型
    // 项目经理、客服、报价专员、报销专员
    private String identifyType;

    // 统计类型
    private String countType;
    private String countTypeName;

    // 订单类型
    // 工单、服务单、报销单、报价单
    private String orderType;
    private String orderTypeName;

    // 订单数量
    private Integer orderCount;

    private Integer qualifiedCount;
    private Integer unQualifiedCount;

    //报价单
    private Integer disposeOrderQuantity;

    private Integer allOrderQuantity;

    private String indexX;

    private Integer indexY;

    public String getIndexX() {
        return indexX;
    }

    public void setIndexX(String indexX) {
        this.indexX = indexX;
    }

    public Integer getIndexY() {
        return indexY;
    }

    public void setIndexY(Integer indexY) {
        this.indexY = indexY;
    }

    public Integer getQualifiedCount() {
        return qualifiedCount;
    }

    public void setQualifiedCount(Integer qualifiedCount) {
        this.qualifiedCount = qualifiedCount;
    }

    public Integer getUnQualifiedCount() {
        return unQualifiedCount;
    }

    public void setUnQualifiedCount(Integer unQualifiedCount) {
        this.unQualifiedCount = unQualifiedCount;
    }

    // 订单状态
    // 已完成
    private String orderStatus;

    // 完成状态
    private String completedType;

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getCountType() {
        return countType;
    }

    public void setCountType(String countType) {
        this.countType = countType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCompletedType() {
        return completedType;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public void setCompletedType(String completedType) {
        this.completedType = completedType;
    }

    public String getCountTypeName() {
        return countTypeName;
    }

    public void setCountTypeName(String countTypeName) {
        this.countTypeName = countTypeName;
    }

    public Integer getDisposeOrderQuantity() {
        return disposeOrderQuantity;
    }

    public void setDisposeOrderQuantity(Integer disposeOrderQuantity) {
        this.disposeOrderQuantity = disposeOrderQuantity;
    }

    public Integer getAllOrderQuantity() {
        return allOrderQuantity;
    }

    public void setAllOrderQuantity(Integer allOrderQuantity) {
        this.allOrderQuantity = allOrderQuantity;
    }
}
