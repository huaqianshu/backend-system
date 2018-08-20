package com.anycall.base.model.finance.bo;

import com.anycall.base.model.finance.vo.SettlementQuotationLineVo;


public class SettlementQuotationLineBo extends SettlementQuotationLineVo {

    private static final long serialVersionUID = -2121154121101121917L;
    private Long contractId;
    private String mergeQuotationOrderNo;

    private Double lastSettlementPrice;
    private Double lastApprovalPrice;
    //导出结算报价单上，报价金额
    private Double excelSettlementPrice;

    public String getMergeQuotationOrderNo() {
        return mergeQuotationOrderNo;
    }

    public void setMergeQuotationOrderNo(String mergeQuotationOrderNo) {
        this.mergeQuotationOrderNo = mergeQuotationOrderNo;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Double getLastSettlementPrice() {
        return lastSettlementPrice==null?0d:lastSettlementPrice;
    }

    public void setLastSettlementPrice(Double lastSettlementPrice) {
        this.lastSettlementPrice = lastSettlementPrice;
    }

    public Double getLastApprovalPrice() {
        return lastApprovalPrice==null?0d:lastApprovalPrice;
    }

    public void setLastApprovalPrice(Double lastApprovalPrice) {
        this.lastApprovalPrice = lastApprovalPrice;
    }

    public Double getExcelSettlementPrice() {
        return excelSettlementPrice;
    }

    public void setExcelSettlementPrice(Double excelSettlementPrice) {
        this.excelSettlementPrice = excelSettlementPrice;
    }
}
