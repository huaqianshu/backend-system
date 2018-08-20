package com.anycall.base.model.finance.vo;


import com.anycall.base.model.business.QuotationOrderItem;
import com.anycall.base.model.finance.SettlementQuotationLineItem;

import java.util.Date;
import java.util.List;


public class SettlementQuotationLineItemVo extends SettlementQuotationLineItem {

    private String quotationOrderNo;

    private String serviceOrderNo;

    private String quotationStatus;

    private Long serviceOrderId;

    //是否在保
    private Boolean isInService;

    private Date reportTime;

    //报修数量
    private Integer reportQuantity;

    private Double lastSettlementPrice = 0d;
    private Double lastApprovalPrice = 0d;

    private List<QuotationOrderItem> quoItems;

    public List<QuotationOrderItem> getQuoItems() {
        return quoItems;
    }

    public void setQuoItems(List<QuotationOrderItem> quoItems) {
        this.quoItems = quoItems;
    }

    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getQuotationStatus() {
        return quotationStatus;
    }

    public void setQuotationStatus(String quotationStatus) {
        this.quotationStatus = quotationStatus;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public Boolean getIsInService() {
        return isInService;
    }

    public void setIsInService(Boolean isInService) {
        this.isInService = isInService;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getReportQuantity() {
        return reportQuantity;
    }

    public void setReportQuantity(Integer reportQuantity) {
        this.reportQuantity = reportQuantity;
    }

    public Double getLastSettlementPrice() {
        return lastSettlementPrice;
    }

    public void setLastSettlementPrice(Double lastSettlementPrice) {
        this.lastSettlementPrice = lastSettlementPrice;
    }

    public Double getLastApprovalPrice() {
        return lastApprovalPrice;
    }

    public void setLastApprovalPrice(Double lastApprovalPrice) {
        this.lastApprovalPrice = lastApprovalPrice;
    }
}
