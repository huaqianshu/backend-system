package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

public class Reimbursement extends AbstractPersistable {

    private String workOrderNo;

    private String reimbursementNo;

    //利润率
    private Double profitRate;

    private Long workOrderId;

    //申报总金额
    private Double applyAmout;

    //报销总金额
    private Double reimburseAmout;

    private Long supplierId;

    //是否统包
    private Boolean allin;

    //统包费用
    private Double allinFee;

    //需要报价
    private Boolean needQuote;

    //扣款总金额
    private Double discount;

    //工人id
    private Long staffId;

    private Long serviceOrderId;

    private String serviceOrderNo;

    private ReimburseStatus status = ReimburseStatus.INPUTED;

    private Long contractId;

    private String shopCode;

    private Double itemTotal;

    private Date createTime;

    private Date updateTime;

    private String updater;

    //是否可以报销
    private Boolean reimburseEnabled;

    //待办
    private Boolean holding = false;

    //收款人
    private String payee;

    //备注
    private String memo;

    //审批时间
    private Date reapprovedTime;

    //支付单号
    private Long paymentOrderId;

    //支付增减金额
    private Double paymentChangesPrice;

    //支付增减原因
    private String paymentChangesCause;

    //支付金额
    private Double paymentPrice;
    //收款人城市
    private String payeeCity;
    private String payeeCardNum;


    public String getPayeeCardNum() {
        return payeeCardNum;
    }

    public void setPayeeCardNum(String payeeCardNum) {
        this.payeeCardNum = payeeCardNum;
    }

    public String getPayeeBankName() {
        return payeeBankName;
    }

    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
    }

    private String payeeBankName;
    public Boolean getHolding() {
        return holding;
    }

    public void setHolding(Boolean holding) {
        this.holding = holding;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Boolean getAllin() {
        return allin;
    }

    public void setAllin(Boolean allin) {
        this.allin = allin;
    }

    public Double getAllinFee() {
        return allinFee;
    }

    public void setAllinFee(Double allinFee) {
        this.allinFee = allinFee;
    }

    public Double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(Double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Double getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(Double profitRate) {
        this.profitRate = profitRate;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getReimbursementNo() {
        return reimbursementNo;
    }

    public void setReimbursementNo(String reimbursementNo) {
        this.reimbursementNo = reimbursementNo;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Double getApplyAmout() {
        return applyAmout;
    }

    public void setApplyAmout(Double applyAmout) {
        this.applyAmout = applyAmout;
    }

    public Double getReimburseAmout() {
        return reimburseAmout;
    }

    public void setReimburseAmout(Double reimburseAmout) {
        this.reimburseAmout = reimburseAmout;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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

    public ReimburseStatus getStatus() {
        return status;
    }

    public void setStatus(ReimburseStatus status) {
        this.status = status;
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

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Boolean getReimburseEnabled() {
        return reimburseEnabled;
    }

    public void setReimburseEnabled(Boolean reimburseEnabled) {
        this.reimburseEnabled = reimburseEnabled;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getReapprovedTime() {
        return reapprovedTime;
    }

    public void setReapprovedTime(Date reapprovedTime) {
        this.reapprovedTime = reapprovedTime;
    }

    public Double getPaymentChangesPrice() {
        return paymentChangesPrice;
    }

    public void setPaymentChangesPrice(Double paymentChangesPrice) {
        this.paymentChangesPrice = paymentChangesPrice;
    }

    public String getPaymentChangesCause() {
        return paymentChangesCause;
    }

    public void setPaymentChangesCause(String paymentChangesCause) {
        this.paymentChangesCause = paymentChangesCause;
    }

    public Double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(Double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public Long getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(Long paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public Boolean getNeedQuote() {
        return needQuote;
    }

    public void setNeedQuote(Boolean needQuote) {
        this.needQuote = needQuote;
    }

    public String getPayeeCity() {
        return payeeCity;
    }

    public void setPayeeCity(String payeeCity) {
        this.payeeCity = payeeCity;
    }
}
