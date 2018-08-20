package com.anycall.base.model.finance.condition;


import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SettlementReceiptSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = -518286859575903291L;

    private Long settlementId;

    private Long settlementReceiptId;

    private Long brandId;
    //金额
    private Double noTaxPrice;
    //发票号码
    private String receiptNo;
    //状态
    private String receiptStatus;
    //开票金额
    private Double receiptPrice;
    //付款方名称
    private String paymentName;
    //创建开始时间
    private Date createStartTime;
    //创建结束时间
    private Date createEndTime;
    //开票开始时间
    private Date receiptTimeStartTime;
    //开票结束时间
    private Date receiptTimeEndTime;

    private List<String> receiptStatusList;

    public Long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    public Long getSettlementReceiptId() {
        return settlementReceiptId;
    }

    public void setSettlementReceiptId(Long settlementReceiptId) {
        this.settlementReceiptId = settlementReceiptId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Double getNoTaxPrice() {
        return noTaxPrice;
    }

    public void setNoTaxPrice(Double noTaxPrice) {
        this.noTaxPrice = noTaxPrice;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(String receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public Double getReceiptPrice() {
        return receiptPrice;
    }

    public void setReceiptPrice(Double receiptPrice) {
        this.receiptPrice = receiptPrice;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public Date getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }

    public Date getReceiptTimeStartTime() {
        return receiptTimeStartTime;
    }

    public void setReceiptTimeStartTime(Date receiptTimeStartTime) {
        this.receiptTimeStartTime = receiptTimeStartTime;
    }

    public Date getReceiptTimeEndTime() {
        return receiptTimeEndTime;
    }

    public void setReceiptTimeEndTime(Date receiptTimeEndTime) {
        this.receiptTimeEndTime = receiptTimeEndTime;
    }

    public List<String> getReceiptStatusList() {
        return receiptStatusList;
    }

    public void setReceiptStatusList(List<String> receiptStatusList) {
        this.receiptStatusList = receiptStatusList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettlementReceiptSearchPageCondition that = (SettlementReceiptSearchPageCondition) o;
        return Objects.equals(settlementId, that.settlementId) &&
                Objects.equals(settlementReceiptId, that.settlementReceiptId) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(noTaxPrice, that.noTaxPrice) &&
                Objects.equals(receiptNo, that.receiptNo) &&
                Objects.equals(receiptStatus, that.receiptStatus) &&
                Objects.equals(receiptPrice, that.receiptPrice) &&
                Objects.equals(paymentName, that.paymentName) &&
                Objects.equals(createStartTime, that.createStartTime) &&
                Objects.equals(createEndTime, that.createEndTime) &&
                Objects.equals(receiptTimeStartTime, that.receiptTimeStartTime) &&
                Objects.equals(receiptTimeEndTime, that.receiptTimeEndTime) &&
                Objects.equals(receiptStatusList, that.receiptStatusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), settlementId, settlementReceiptId, brandId, noTaxPrice, receiptNo, receiptStatus, receiptPrice, paymentName, createStartTime, createEndTime, receiptTimeStartTime, receiptTimeEndTime, receiptStatusList);
    }
}
