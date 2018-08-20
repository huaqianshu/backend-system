package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;


public class QuotationOrder extends AbstractPersistable {

    private static final long serialVersionUID = -7749878847109160427L;

    private Integer version;

    //合并单Id
    private Long mergeQuotationOrderId;

    //合并单号
    private String mergeQuotationOrderNo;

    //服务单
    private Long serviceOrderId;

    //跟进单号
    private Long relatedWorkOrderId;

    //工单
    private Long workOrderId;

    private String quotationOrderNo;

    //是否合并
    private Boolean merge = false;

    //报价状态(草稿/预审通过/制单完成/已提交甲方/甲方确认/已结算/非报价项/重拟方案/甲方拒绝)(QuotationOrderType)
    private QuotationStatus quotationStatus;

    //报价类型（自动、手动、补报价）
    private QuotationType quotationType;

    //是否制单(报价项目>=1)
    private Boolean confirmSingle = false;

    //结算进度
    private ClearingProgress settlementStatus = ClearingProgress.NOSETTLEMENT;

    //品牌
    private Long companyBrandId;

    //门店
    private String shopCode;

    private Long companyId;

    private Long supplierId;


    //驳回原因
    private String rejectCause;

    //成本总计(costPrices)
    private Double costTotals;

    //报价总计
    private Double quoteTotals;

    //预估金额
    private Double estimatePriceAmount;

    //毛利率
    private String grossProfitRate;

    //调度人Id
    private Long dispatcherId;

    //制单人
    private String producer;

    //报价工人(选择本服务商下的所有工人)
    private Long workerId;

    //是否先做后报
    private Boolean doOrUse;

    //故障现象
    private String faultPhenomenon;

    //备注
    private String memo;

    //创建时间
    private Date createTime;

    //复审时间
    private Date reviewTime;
    //申请时间
    private Date submitTime;

    private String updater;

    //更新时间
    private Date updateTime;

    //超时未报
    private Boolean quotationTimeout = false;

    private String cancelOrStopCause;

    //预审时间
    private Date pretrialTime;

    private Boolean costUpload = false;

    //是否申诉
    private Boolean appeal=false;

    public Long getMergeQuotationOrderId() {
        return mergeQuotationOrderId;
    }

    public void setMergeQuotationOrderId(Long mergeQuotationOrderId) {
        this.mergeQuotationOrderId = mergeQuotationOrderId;
    }

    public String getMergeQuotationOrderNo() {
        return mergeQuotationOrderNo;
    }

    public void setMergeQuotationOrderNo(String mergeQuotationOrderNo) {
        this.mergeQuotationOrderNo = mergeQuotationOrderNo;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
    }

    public Boolean getMerge() {
        return merge;
    }

    public void setMerge(Boolean merge) {
        this.merge = merge;
    }

    public QuotationStatus getQuotationStatus() {
        return quotationStatus;
    }

    public void setQuotationStatus(QuotationStatus quotationStatus) {
        this.quotationStatus = quotationStatus;
    }

    public QuotationType getQuotationType() {
        return quotationType;
    }

    public void setQuotationType(QuotationType quotationType) {
        this.quotationType = quotationType;
    }

    public ClearingProgress getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(ClearingProgress settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Long getCompanyBrandId() {
        return companyBrandId;
    }

    public void setCompanyBrandId(Long companyBrandId) {
        this.companyBrandId = companyBrandId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getRejectCause() {
        return rejectCause;
    }

    public void setRejectCause(String rejectCause) {
        this.rejectCause = rejectCause;
    }

    public Double getCostTotals() {
        return costTotals;
    }

    public void setCostTotals(Double costTotals) {
        this.costTotals = costTotals;
    }

    public Double getQuoteTotals() {
        return quoteTotals;
    }

    public void setQuoteTotals(Double quoteTotals) {
        this.quoteTotals = quoteTotals;
    }

    public Double getEstimatePriceAmount() {
        return estimatePriceAmount;
    }

    public void setEstimatePriceAmount(Double estimatePriceAmount) {
        this.estimatePriceAmount = estimatePriceAmount;
    }

    public String getGrossProfitRate() {
        return grossProfitRate;
    }

    public void setGrossProfitRate(String grossProfitRate) {
        this.grossProfitRate = grossProfitRate;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public Boolean getDoOrUse() {
        return doOrUse;
    }

    public void setDoOrUse(Boolean doOrUse) {
        this.doOrUse = doOrUse;
    }

    public String getFaultPhenomenon() {
        return faultPhenomenon;
    }

    public void setFaultPhenomenon(String faultPhenomenon) {
        this.faultPhenomenon = faultPhenomenon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
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

    public Boolean getConfirmSingle() {
        return confirmSingle;
    }

    public void setConfirmSingle(Boolean confirmSingle) {
        this.confirmSingle = confirmSingle;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getRelatedWorkOrderId() {
        return relatedWorkOrderId;
    }

    public void setRelatedWorkOrderId(Long relatedWorkOrderId) {
        this.relatedWorkOrderId = relatedWorkOrderId;
    }

    public Boolean getQuotationTimeout() {
        return quotationTimeout;
    }

    public void setQuotationTimeout(Boolean quotationTimeout) {
        this.quotationTimeout = quotationTimeout;
    }

    public String getCancelOrStopCause() {
        return cancelOrStopCause;
    }

    public void setCancelOrStopCause(String cancelOrStopCause) {
        this.cancelOrStopCause = cancelOrStopCause;
    }

    public Date getPretrialTime() {
        return pretrialTime;
    }

    public void setPretrialTime(Date pretrialTime) {
        this.pretrialTime = pretrialTime;
    }

    public Boolean getCostUpload() {
        return costUpload;
    }

    public void setCostUpload(Boolean costUpload) {
        this.costUpload = costUpload;
    }

    public Boolean getAppeal() {
        return appeal;
    }

    public void setAppeal(Boolean appeal) {
        this.appeal = appeal;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
}
