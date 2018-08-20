package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Auser on 2017/4/19.
 */
public class PaymentOrder extends AbstractPersistable{

    private String paymentOrderNo;

    private String paymentOrderName;

    private ReimburseStatus paymentStatus = ReimburseStatus.PAYING;

    private String issuer;

    private Double paymentPrice;

    private String memo;

    private Long supplierId;

    private Boolean deleted = false;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getPaymentOrderName() {
        return paymentOrderName;
    }

    public void setPaymentOrderName(String paymentOrderName) {
        this.paymentOrderName = paymentOrderName;
    }

    public ReimburseStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(ReimburseStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(Double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
