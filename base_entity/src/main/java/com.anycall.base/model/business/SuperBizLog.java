package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.BizLogOperationType;

import java.util.Date;

/**
 * Created by Robin on 16/9/14.
 */
public class SuperBizLog extends AbstractPersistable {

    private static final long serialVersionUID = 4500856760887949573L;

    public SuperBizLog() {}

    public SuperBizLog(Long modelId, String modelType, Long serviceOrderId, String serviceOrderNo, ServiceOrderStatus serviceOrderStatus, String subStatus, String creator) {
        this.modelId = modelId;
        this.modelType = modelType;
        this.serviceOrderId = serviceOrderId;
        this.serviceOrderNo = serviceOrderNo;
        this.serviceOrderStatus = serviceOrderStatus;
        this.subStatus = subStatus;
        this.creator = creator;
    }

    //单据Id
    private Long modelId;

    private String modelType;

    private Long serviceOrderId;

    private String serviceOrderNo;

    //大状态(服务单状态)
    private ServiceOrderStatus serviceOrderStatus;

    //小状态(工单或报价单状态)
    private String subStatus;

    //状态操作描述
    private String desc;

    private Date createTime;

    private String creator;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public ServiceOrderStatus getServiceOrderStatus() {
        return serviceOrderStatus;
    }

    public void setServiceOrderStatus(ServiceOrderStatus serviceOrderStatus) {
        this.serviceOrderStatus = serviceOrderStatus;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
