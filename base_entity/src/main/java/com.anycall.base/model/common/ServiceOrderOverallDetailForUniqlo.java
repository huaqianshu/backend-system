package com.anycall.base.model.common;

import com.anycall.base.model.account.ChargingType;
import com.anycall.base.model.business.bo.QuotationOrderBo;
import com.anycall.base.model.business.bo.ServiceOrderBo;

import java.util.Date;
import java.util.List;

/**
 * Created by Robin on 16/11/17.
 */
public class ServiceOrderOverallDetailForUniqlo extends ServiceOrderBo {

    private static final long serialVersionUID = -2518293450365403147L;

    private String quotationOrderNo;

    //客服
    private String supporterName;

    //客服联系方式
    private String supporterTel;

    //接单担当
    private String receiveMan;

    //工人
    private String staffName;

    //工人联系方式
    private String staffTel;

    //完工确认人
    private String completeConfirmMan;

    //完工评价
    private String completeEvaluate;

    //实际维修日
    private Date realStartTime;

    //项目预算
    private Double projectBudget;

    //报价数量
    private Double quotationQty;

    //报价单价
    private Double quotationPrice;

    //报价金额
    private Double quotationTotal;

    //报价审核数量
    private Double quotationApprovalQty;

    //报价审核单价
    private Double quotationApprovalPrice;

    //报价审核金额
    private Double quotationApprovalTotal;

    //报价说明
    private String quotationMemo;

    //审核意见
    private String approvalMemo;

    //计价类型
    private ChargingType chargingType;

    private List<String> selfieImgs;
    private List<String> repairBeforeImgs;
    private List<String> itemImgs;
    private List<String> repairAfterImgs;
    private List<String> billsImgs;


    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
    }

    public String getSupporterTel() {
        return supporterTel;
    }

    public void setSupporterTel(String supporterTel) {
        this.supporterTel = supporterTel;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getCompleteConfirmMan() {
        return completeConfirmMan;
    }

    public void setCompleteConfirmMan(String completeConfirmMan) {
        this.completeConfirmMan = completeConfirmMan;
    }

    public String getCompleteEvaluate() {
        return completeEvaluate;
    }

    public void setCompleteEvaluate(String completeEvaluate) {
        this.completeEvaluate = completeEvaluate;
    }

    public Date getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    public Double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Double projectBudget) {
        this.projectBudget = projectBudget;
    }

    public Double getQuotationQty() {
        return quotationQty;
    }

    public void setQuotationQty(Double quotationQty) {
        this.quotationQty = quotationQty;
    }

    public Double getQuotationPrice() {
        return quotationPrice;
    }

    public void setQuotationPrice(Double quotationPrice) {
        this.quotationPrice = quotationPrice;
    }

    public Double getQuotationTotal() {
        return quotationTotal;
    }

    public void setQuotationTotal(Double quotationTotal) {
        this.quotationTotal = quotationTotal;
    }

    public Double getQuotationApprovalQty() {
        return quotationApprovalQty;
    }

    public void setQuotationApprovalQty(Double quotationApprovalQty) {
        this.quotationApprovalQty = quotationApprovalQty;
    }

    public Double getQuotationApprovalPrice() {
        return quotationApprovalPrice;
    }

    public void setQuotationApprovalPrice(Double quotationApprovalPrice) {
        this.quotationApprovalPrice = quotationApprovalPrice;
    }

    public Double getQuotationApprovalTotal() {
        return quotationApprovalTotal;
    }

    public void setQuotationApprovalTotal(Double quotationApprovalTotal) {
        this.quotationApprovalTotal = quotationApprovalTotal;
    }

    public String getQuotationMemo() {
        return quotationMemo;
    }

    public void setQuotationMemo(String quotationMemo) {
        this.quotationMemo = quotationMemo;
    }

    public String getApprovalMemo() {
        return approvalMemo;
    }

    public void setApprovalMemo(String approvalMemo) {
        this.approvalMemo = approvalMemo;
    }

    public String getSupporterName() {
        return supporterName;
    }

    public void setSupporterName(String supporterName) {
        this.supporterName = supporterName;
    }

    public ChargingType getChargingType() {
        return chargingType;
    }

    public void setChargingType(ChargingType chargingType) {
        this.chargingType = chargingType;
    }

    public List<String> getSelfieImgs() {
        return selfieImgs;
    }

    public void setSelfieImgs(List<String> selfieImgs) {
        this.selfieImgs = selfieImgs;
    }

    public List<String> getRepairBeforeImgs() {
        return repairBeforeImgs;
    }

    public void setRepairBeforeImgs(List<String> repairBeforeImgs) {
        this.repairBeforeImgs = repairBeforeImgs;
    }

    public List<String> getItemImgs() {
        return itemImgs;
    }

    public void setItemImgs(List<String> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public List<String> getRepairAfterImgs() {
        return repairAfterImgs;
    }

    public void setRepairAfterImgs(List<String> repairAfterImgs) {
        this.repairAfterImgs = repairAfterImgs;
    }

    public List<String> getBillsImgs() {
        return billsImgs;
    }

    public void setBillsImgs(List<String> billsImgs) {
        this.billsImgs = billsImgs;
    }


}
