package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Amy on 2016/12/30.
 */
public class OrderOperationLog extends AbstractPersistable{

    private static final long serialVersionUID = 4704660322079633965L;

    private String modelType;

    private String modelId;

    private OrderOperationType operationType;

    private String memo;

    private String operator;

    private Date logTime;

    private SynStatus synStatus = SynStatus.UNSYNCHRONIZED;

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public OrderOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OrderOperationType operationType) {
        this.operationType = operationType;
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

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public SynStatus getSynStatus() {
        return synStatus;
    }

    public void setSynStatus(SynStatus synStatus) {
        this.synStatus = synStatus;
    }
}
