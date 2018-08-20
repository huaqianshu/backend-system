package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;


public class SettlementQuotationLineItem extends AbstractPersistable {

    private static final long serialVersionUID = 4714789226089082698L;

    private Long settlementQuotationLineId;

    private Long quotationOrderProjectId;

    //预报价总额
    private Double prequotationPrice;

    //预报价审批总额
    private Double prequotationApprovedPrice;

    //合约项目编号
    private Long contractProjectId;

    private String projectCode;

    private String projectName;

    //成本总计
    private Double cost;

    //毛利率
    private String grossProfitRateLine;
    //单位
    private String unit;

    //结算单价
    private Double settlementUnitPrice;

    //结算数量
    private Double settlementNumber;

    //结算总计
    private Double settlementTotal;

    //结算报价核对值
    private Double checkTotal;


    //审批单价
    private Double approvalUnitPrice;

    //审批数量
    private Double approvalNumber;

    //审批总计
    private Double totalApproval;

    //备注
    private String memo;

    //甲方备注
    private String approvalMemo;

    //前一次结算数据
    private String lastSettlementData;

    //前一次审批数据
    private String lastApprovalData;

    public Long getSettlementQuotationLineId() {
        return settlementQuotationLineId;
    }

    public void setSettlementQuotationLineId(Long settlementQuotationLineId) {
        this.settlementQuotationLineId = settlementQuotationLineId;
    }

    public Long getQuotationOrderProjectId() {
        return quotationOrderProjectId;
    }

    public void setQuotationOrderProjectId(Long quotationOrderProjectId) {
        this.quotationOrderProjectId = quotationOrderProjectId;
    }

    public Double getPrequotationPrice() {
        return prequotationPrice;
    }

    public void setPrequotationPrice(Double prequotationPrice) {
        this.prequotationPrice = prequotationPrice==null?0d:prequotationPrice;
    }

    public Double getPrequotationApprovedPrice() {
        return prequotationApprovedPrice;
    }

    public void setPrequotationApprovedPrice(Double prequotationApprovedPrice) {
        this.prequotationApprovedPrice = prequotationApprovedPrice==null?0d:prequotationApprovedPrice;
    }

    public Long getContractProjectId() {
        return contractProjectId;
    }

    public void setContractProjectId(Long contractProjectId) {
        this.contractProjectId = contractProjectId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
        this.cost = cost==null?0d:cost;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getSettlementUnitPrice() {
        return settlementUnitPrice;
    }

    public void setSettlementUnitPrice(Double settlementUnitPrice) {
        this.settlementUnitPrice = settlementUnitPrice==null?0d:settlementUnitPrice;
    }

    public Double getSettlementNumber() {
        return settlementNumber;
    }

    public void setSettlementNumber(Double settlementNumber) {
        this.settlementNumber = settlementNumber==null?0:settlementNumber;
    }

    public Double getSettlementTotal() {
        return settlementTotal;
    }

    public void setSettlementTotal(Double settlementTotal) {
        this.settlementTotal = settlementTotal==null?0d:settlementTotal;
    }

    public Double getCheckTotal() {
        return checkTotal;
    }

    public void setCheckTotal(Double checkTotal) {
        this.checkTotal = checkTotal==null?0d:checkTotal;
    }

    public String getGrossProfitRateLine() {
        return grossProfitRateLine;
    }

    public void setGrossProfitRateLine(String grossProfitRateLine) {
        this.grossProfitRateLine = grossProfitRateLine;
    }

    public Double getApprovalUnitPrice() {
        return approvalUnitPrice;
    }

    public void setApprovalUnitPrice(Double approvalUnitPrice) {
        this.approvalUnitPrice = approvalUnitPrice==null?0d:approvalUnitPrice;
    }

    public Double getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(Double approvalNumber) {
        this.approvalNumber = approvalNumber==null?0d:approvalNumber;
    }

    public Double getTotalApproval() {
        return totalApproval;
    }

    public void setTotalApproval(Double totalApproval) {
        this.totalApproval = totalApproval==null?0d:totalApproval;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getApprovalMemo() {
        return approvalMemo;
    }

    public void setApprovalMemo(String approvalMemo) {
        this.approvalMemo = approvalMemo;
    }

    public String getLastSettlementData() {
        return lastSettlementData;
    }

    public void setLastSettlementData(String lastSettlementData) {
        this.lastSettlementData = lastSettlementData;
    }

    public String getLastApprovalData() {
        return lastApprovalData;
    }

    public void setLastApprovalData(String lastApprovalData) {
        this.lastApprovalData = lastApprovalData;
    }
}
