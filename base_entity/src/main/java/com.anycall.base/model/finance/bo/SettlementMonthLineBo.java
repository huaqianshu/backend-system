package com.anycall.base.model.finance.bo;

import com.anycall.base.model.finance.vo.SettlementMonthLineVo;

import java.util.Date;


public class SettlementMonthLineBo extends SettlementMonthLineVo {

    private static final long serialVersionUID = 7031121901144202956L;

    private Long serviceOrderId;

    private String quotationOrderNo;

    private String serviceOrderNo;

    private String settlementNo;

    private Date quoteReviewTime;

    private Date quoteCreateTime;

    private Date serviceReportTime;

    private Date serviceFinishTime;

    private String mergeNo;

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
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

    public Date getQuoteReviewTime() {
        return quoteReviewTime;
    }

    public void setQuoteReviewTime(Date quoteReviewTime) {
        this.quoteReviewTime = quoteReviewTime;
    }

    public Date getQuoteCreateTime() {
        return quoteCreateTime;
    }

    public void setQuoteCreateTime(Date quoteCreateTime) {
        this.quoteCreateTime = quoteCreateTime;
    }

    public Date getServiceReportTime() {
        return serviceReportTime;
    }

    public void setServiceReportTime(Date serviceReportTime) {
        this.serviceReportTime = serviceReportTime;
    }

    public Date getServiceFinishTime() {
        return serviceFinishTime;
    }

    public void setServiceFinishTime(Date serviceFinishTime) {
        this.serviceFinishTime = serviceFinishTime;
    }

    public String getMergeNo() {
        return mergeNo;
    }

    public void setMergeNo(String mergeNo) {
        this.mergeNo = mergeNo;
    }
}
