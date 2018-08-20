package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.ReimburseStatus;
import com.anycall.base.model.business.ReimbursementLine;

import java.util.Date;

/**
 * Created by Amy on 2017/3/16.
 */
public class ReimbursementLineExcelBo extends ReimbursementLine {
    private static final long serialVersionUID = -3175202548946953400L;

    private String paymentOrderNo;

    private String reimbursementNo;

    private String status;

    private String reimburseEnabled;

    private Double applyAmout;

    private Double discount;

    private Double reimburseAmout;

    private String staffName;

    private String payee;

    private String workOrderNo;

    private String serviceOrderNo;

    private Double profitRate;

    private Date createTime;

    private String lineStatus;

    private String brandName;

    private Date realEndTime;//实际完成时间

    private Date reportTime;//报修时间

    public String getReimbursementNo() {
        return reimbursementNo;
    }

    public void setReimbursementNo(String reimbursementNo) {
        this.reimbursementNo = reimbursementNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReimburseEnabled() {
        return reimburseEnabled;
    }

    public void setReimburseEnabled(String reimburseEnabled) {
        this.reimburseEnabled = reimburseEnabled;
    }

    public Double getApplyAmout() {
        return applyAmout;
    }

    public void setApplyAmout(Double applyAmout) {
        this.applyAmout = applyAmout;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getReimburseAmout() {
        return reimburseAmout;
    }

    public void setReimburseAmout(Double reimburseAmout) {
        this.reimburseAmout = reimburseAmout;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public Double getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(Double profitRate) {
        this.profitRate = profitRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Date getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }
}
