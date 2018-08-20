package com.anycall.base.model.common;

import com.anycall.base.model.general.BizLogOperationType;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Robin on 16/11/17.
 */
public class ServiceOrderOverall implements Serializable {

    private static final long serialVersionUID = 5170680950516501350L;

    private String orderNo;

    private String orderType;

    private Date logTime;

    private String logMemo;

    private BizLogOperationType operationType=BizLogOperationType.NONE;

    private String operator;

    private Boolean forCustomer =false;

    public ServiceOrderOverall(String orderNo,String orderType,Date logTime, String logMemo,String  operationType,String operator){
        this.orderNo=orderNo;
        this.orderType=orderType;
        this.logTime=logTime;
        this.logMemo=logMemo;
        if(operationType==null||operationType.isEmpty()){
            this.operationType=BizLogOperationType.NONE;
        }else {
            this.operationType=BizLogOperationType.valueOf(operationType);
        }
        this.operator=operator;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getLogMemo() {
        return logMemo;
    }

    public void setLogMemo(String logMemo) {
        this.logMemo = logMemo;
    }

    public BizLogOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(BizLogOperationType operationType) {
        this.operationType = operationType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Boolean getForCustomer() {
        return forCustomer;
    }

    public void setForCustomer(Boolean forCustomer) {
        this.forCustomer = forCustomer;
    }
}
