package com.anycall.base.model.common.condition;

import com.anycall.base.common.PageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class AttentionSearchPageCondition extends PageCondition {

    private static final long serialVersionUID = 3522970035390038982L;

    private String attentionType;
    private List<String> attentionTypes;
    private String searchText;
    private Long receiverId;
    private Boolean attentionStatus;
    private Boolean overdue;
    private String orderType;
    private List<String> unServiceOrderStatusList;//针对急修的过滤条件

    public List<String> getUnServiceOrderStatusList() {
        return unServiceOrderStatusList;
    }

    public void setUnServiceOrderStatusList(List<String> unServiceOrderStatusList) {
        this.unServiceOrderStatusList = unServiceOrderStatusList;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Boolean getOverdue() {
        return overdue;
    }

    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    public Boolean getAttentionStatus() {
        return attentionStatus;
    }

    public void setAttentionStatus(Boolean attentionStatus) {
        this.attentionStatus = attentionStatus;
    }

    public List<String> getAttentionTypes() {
        return attentionTypes;
    }

    public void setAttentionTypes(List<String> attentionTypes) {
        this.attentionTypes = attentionTypes;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getAttentionType() {
        return attentionType;
    }

    public void setAttentionType(String attentionType) {
        this.attentionType = attentionType;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AttentionSearchPageCondition that = (AttentionSearchPageCondition) o;
        return Objects.equals(attentionType, that.attentionType) &&
                Objects.equals(attentionTypes, that.attentionTypes) &&
                Objects.equals(searchText, that.searchText) &&
                Objects.equals(receiverId, that.receiverId) &&
                Objects.equals(attentionStatus, that.attentionStatus) &&
                Objects.equals(overdue, that.overdue)&&
                Objects.equals(orderType, that.orderType)&&
                Objects.equals(unServiceOrderStatusList, that.unServiceOrderStatusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),unServiceOrderStatusList,orderType,overdue,attentionType, attentionTypes, searchText, receiverId, attentionStatus);
    }
}
