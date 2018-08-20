package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.SkuType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


public class QuotationOrderProject extends AbstractPersistable {

    private Long quotationOrderId;

    //项目
    private Long contractProjectId;

    private String projectCode;

    private String projectName;

    //单位
    private String unit;

    //成本总计
    private Double cost;

    //报价单价
    private Double quotationPrice;

    //数量
    private Double projectNumber;

    //报价总计
    private Double quoteTotal;

    //核对值
    private Double checkTotal;

    //毛利率
    private String grossProfitRateLine;

    //审批单价
    private Double approvalUnitPrice;

    //数量
    private Double number;

    //审批总计
    private Double totalApproval;

    //备注
    private String memo;

    //甲方备注
    private String quotationMemo;

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }

    public Long getContractProjectId() {
        return contractProjectId;
    }

    public void setContractProjectId(Long contractProjectId) {
        this.contractProjectId = contractProjectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getQuoteTotal() {
        return quoteTotal;
    }

    public void setQuoteTotal(Double quoteTotal) {
        this.quoteTotal = quoteTotal;
    }

    public String getGrossProfitRateLine() {
        return grossProfitRateLine;
    }

    public void setGrossProfitRateLine(String grossProfitRateLine) {
        this.grossProfitRateLine = grossProfitRateLine;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public Double getApprovalUnitPrice() {
        return approvalUnitPrice;
    }

    public void setApprovalUnitPrice(Double approvalUnitPrice) {
        this.approvalUnitPrice = approvalUnitPrice;
    }

    public Double getTotalApproval() {
        return totalApproval;
    }

    public void setTotalApproval(Double totalApproval) {
        this.totalApproval = totalApproval;
    }

    public Double getQuotationPrice() {
        return quotationPrice;
    }

    public void setQuotationPrice(Double quotationPrice) {
        this.quotationPrice = quotationPrice;
    }

    public Double getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Double projectNumber) {
        this.projectNumber = projectNumber;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getCheckTotal() {
        return checkTotal;
    }

    public void setCheckTotal(Double checkTotal) {
        this.checkTotal = checkTotal;
    }

    public String getQuotationMemo() {
        return quotationMemo;
    }

    public void setQuotationMemo(String quotationMemo) {
        this.quotationMemo = quotationMemo;
    }
}

