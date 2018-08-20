package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Auser on 2016/9/26.
 */
public class AccountingBillOrder extends AbstractPersistable {

    //基本信息
    //核算单编号
    private String accountingBillNo;

    //服务商
    private Long orgId;

    //分公司
    private Long companyId;

    //核算单状态
    private AccountingBillStatus accountingBillStatus;

    //所属年份
    private Integer year;

    //所属月份0-11
    private Integer month;

    //计件
    //计件收入金额
    private Double pieceIncomeAmount;

    //计件报销金额
    private Double pieceReimbursementAmount;

    //计件工人工资
    private Double pieceWorkerWages;

    //计件收支差额
    private Double piecePaymentBalance;

    //计件未收金额
    private Double unpaidAmount;

    //计件补回金额
    private Double amountCompensation;

    //统包
    //统包收入金额
    private Double allinIncomeAmount;

    //统包报销金额
    private Double allinReimbursementAmount;

    //统包工人工资
    private Double allinWorkerWages;

    //统包收支差额
    private Double allinPaymentBalance;

    //制单人
    private String creater;

    //创建时间
     private Date createTime;

    //更新人
    private String updater;

    //更新时间
    private Date updateTime;

    //审核时间
    private Date auditTime;

    public String getAccountingBillNo() {
        return accountingBillNo;
    }

    public void setAccountingBillNo(String accountingBillNo) {
        this.accountingBillNo = accountingBillNo;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public AccountingBillStatus getAccountingBillStatus() {
        return accountingBillStatus;
    }

    public void setAccountingBillStatus(AccountingBillStatus accountingBillStatus) {
        this.accountingBillStatus = accountingBillStatus;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Double getPieceIncomeAmount() {
        return pieceIncomeAmount;
    }

    public void setPieceIncomeAmount(Double pieceIncomeAmount) {
        this.pieceIncomeAmount = pieceIncomeAmount;
    }

    public Double getPieceReimbursementAmount() {
        return pieceReimbursementAmount;
    }

    public void setPieceReimbursementAmount(Double pieceReimbursementAmount) {
        this.pieceReimbursementAmount = pieceReimbursementAmount;
    }

    public Double getPieceWorkerWages() {
        return pieceWorkerWages;
    }

    public void setPieceWorkerWages(Double pieceWorkerWages) {
        this.pieceWorkerWages = pieceWorkerWages;
    }

    public Double getPiecePaymentBalance() {
        return piecePaymentBalance;
    }

    public void setPiecePaymentBalance(Double piecePaymentBalance) {
        this.piecePaymentBalance = piecePaymentBalance;
    }

    public Double getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(Double unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public Double getAmountCompensation() {
        return amountCompensation;
    }

    public void setAmountCompensation(Double amountCompensation) {
        this.amountCompensation = amountCompensation;
    }

    public Double getAllinIncomeAmount() {
        return allinIncomeAmount;
    }

    public void setAllinIncomeAmount(Double allinIncomeAmount) {
        this.allinIncomeAmount = allinIncomeAmount;
    }

    public Double getAllinReimbursementAmount() {
        return allinReimbursementAmount;
    }

    public void setAllinReimbursementAmount(Double allinReimbursementAmount) {
        this.allinReimbursementAmount = allinReimbursementAmount;
    }

    public Double getAllinWorkerWages() {
        return allinWorkerWages;
    }

    public void setAllinWorkerWages(Double allinWorkerWages) {
        this.allinWorkerWages = allinWorkerWages;
    }

    public Double getAllinPaymentBalance() {
        return allinPaymentBalance;
    }

    public void setAllinPaymentBalance(Double allinPaymentBalance) {
        this.allinPaymentBalance = allinPaymentBalance;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}
