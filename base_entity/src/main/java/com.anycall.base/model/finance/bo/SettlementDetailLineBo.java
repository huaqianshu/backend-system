package com.anycall.base.model.finance.bo;

import com.anycall.base.model.finance.vo.SettlementDetailLineVo;

import java.util.Date;


public class SettlementDetailLineBo extends SettlementDetailLineVo {

    private static final long serialVersionUID = -2121154193402021917L;

    private Long serviceOrderId;

    private String quotationOrderNo;

    private String mergeNo;

    private String serviceOrderNo;

    private String settlementNo;

    private Date quoteReviewTime;

    private Date quoteCreateTime;

    private Date serviceReportTime;

    private Date serviceFinishTime;

    private Long contractId;

    private Integer allInSettlementDay;

    private Double statisticsSettlementPrice;

    private String cityName;

    private String districtName;

    private String stateName;

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

    public String getMergeNo() {
        return mergeNo;
    }

    public void setMergeNo(String mergeNo) {
        this.mergeNo = mergeNo;
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

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Integer getAllInSettlementDay() {
        return allInSettlementDay;
    }

    public void setAllInSettlementDay(Integer allInSettlementDay) {
        this.allInSettlementDay = allInSettlementDay;
    }

    public Double getStatisticsSettlementPrice() {
        return statisticsSettlementPrice;
    }

    public void setStatisticsSettlementPrice(Double statisticsSettlementPrice) {
        this.statisticsSettlementPrice = statisticsSettlementPrice;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
