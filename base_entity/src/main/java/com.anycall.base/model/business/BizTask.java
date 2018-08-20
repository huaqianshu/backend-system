package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

public class BizTask extends AbstractPersistable {

    private static final long serialVersionUID = 1722853211222248094L;

    private Long fromMemberId;
    private Long toMemberId;
    private BizTaskType taskType;
    private String taskTitle;
    private String taskContent;
    private BizTaskStatus status;
    private String source;
    private BizTaskOrderType orderType;
    private String orderNo;
    private Object data;
    private String result;
    private String memo;
    private String operator;
    private Date createTime;
    private Date updateTime;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getFromMemberId() {
        return fromMemberId;
    }

    public void setFromMemberId(Long fromMemberId) {
        this.fromMemberId = fromMemberId;
    }

    public Long getToMemberId() {
        return toMemberId;
    }

    public void setToMemberId(Long toMemberId) {
        this.toMemberId = toMemberId;
    }

    public BizTaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(BizTaskType taskType) {
        this.taskType = taskType;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public BizTaskStatus getStatus() {
        return status;
    }

    public void setStatus(BizTaskStatus status) {
        this.status = status;
    }

    public BizTaskOrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(BizTaskOrderType orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
