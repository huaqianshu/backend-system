package com.anycall.base.model.business.bo;


import com.anycall.base.model.business.vo.ReimbursementVo;
import com.anycall.base.model.business.vo.WorkOrderVo;

import java.util.Date;

/**
 * Created by Robin on 16/8/30.
 */
public class ReimbursementBo extends ReimbursementVo {

    private String paymentOrderNo;
    private String grossProfitRate;//利润率
    private String staffName;
    private double subtotalSum;//总价格
    private double reApprovedDiscountSum;//实际通过价格
    private String brandName;
    private Date realEndTime;//实际完成时间
    private Date reportTime;//报修时间

    private WorkOrderVo workOrder;

    private Long quotationOrderId;
    private String quotationOrderNo;

    public WorkOrderVo getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderVo workOrder) {
        this.workOrder = workOrder;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public double getSubtotalSum() {
        return subtotalSum;
    }

    public void setSubtotalSum(double subtotalSum) {
        this.subtotalSum = subtotalSum;
    }

    public double getReApprovedDiscountSum() {
        return reApprovedDiscountSum;
    }

    public void setReApprovedDiscountSum(double reApprovedDiscountSum) {
        this.reApprovedDiscountSum = reApprovedDiscountSum;
    }

    public String getGrossProfitRate() {
        return grossProfitRate;
    }

    public void setGrossProfitRate(String grossProfitRate) {
        this.grossProfitRate = grossProfitRate;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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

    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
    }

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }
}
