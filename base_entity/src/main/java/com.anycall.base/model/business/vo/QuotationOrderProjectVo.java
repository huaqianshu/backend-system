package com.anycall.base.model.business.vo;


import com.anycall.base.model.business.QuotationOrderItem;
import com.anycall.base.model.business.QuotationOrderProject;

import java.util.Date;
import java.util.List;


public class QuotationOrderProjectVo extends QuotationOrderProject {

    private static final long serialVersionUID = -998374825924984280L;
    private String quotationOrderNo;

    private String serviceOrderNo;

    private String quotationStatus;

    private Long serviceOrderId;

    //是否在保
    private Boolean isInService;

    //是否申诉
    private Boolean appeal=false;

    private Date reportTime;

    //报修数量
    private Integer reportQuantity;

    private String cancelOrStopCause;

    //最大金额
    private Double maxPrice;

    //APP更新审批数据
    private boolean dataChanged;

    //APP更新审批数据
    private int layoutType;

    private String reportMan;

    private String printDesc;

    private String printReportTime;

    private String faultPhenomenon;

    public int getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(int layoutType) {
        this.layoutType = layoutType;
    }

    private List<QuotationOrderItem> quoItems;

    public Boolean getInService() {
        return isInService;
    }

    public void setInService(Boolean inService) {
        isInService = inService;
    }

    public boolean isDataChanged() {
        return dataChanged;
    }

    public void setDataChanged(boolean dataChanged) {
        this.dataChanged = dataChanged;
    }

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

    public String getCancelOrStopCause() {
        return cancelOrStopCause;
    }

    public void setCancelOrStopCause(String cancelOrStopCause) {
        this.cancelOrStopCause = cancelOrStopCause;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Boolean getAppeal() {
        return appeal;
    }

    public void setAppeal(Boolean appeal) {
        this.appeal = appeal;
    }

    public String getReportMan() {
        return reportMan;
    }

    public void setReportMan(String reportMan) {
        this.reportMan = reportMan;
    }

    public String getPrintDesc() {
        return printDesc;
    }

    public void setPrintDesc(String printDesc) {
        this.printDesc = printDesc;
    }

    public String getFaultPhenomenon() {
        return faultPhenomenon;
    }

    public void setFaultPhenomenon(String faultPhenomenon) {
        this.faultPhenomenon = faultPhenomenon;
    }

    public String getPrintReportTime() {
        return printReportTime;
    }

    public void setPrintReportTime(String printReportTime) {
        this.printReportTime = printReportTime;
    }
}
