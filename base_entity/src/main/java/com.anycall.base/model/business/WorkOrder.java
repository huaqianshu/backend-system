package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.ServiceCatalogLevel;

import java.util.Date;

/**
 * Created by Robin on 16/8/30.
 */
public class WorkOrder extends AbstractPersistable {

    private static final long serialVersionUID = 1796853221452248094L;

    private Integer version;

    private ServiceOrderSource source=ServiceOrderSource.CALL;

    //工单来源
    private WorkOrderBillsSource billsSource=WorkOrderBillsSource.SERVICEORDER;

    private String workOrderNo;

    private Long serviceOrderId;

    private String serviceOrderNo;

    private Long staffId;
//预估开始时间
    private Date estimatedStartTime;
    private Long estimatedStartTimeAsLong;
//预估结束时间
    private Date estimatedEndTime;
    private Long estimatedEndTimeAsLong;

    private String reportMan;

    private String reportManTel;

    private Long supplierId;

    private Long companyBrandId;

    private Long companyId;

    private String shopCode;

    private ServiceOrderType type=ServiceOrderType.REPAIR;

    private WorkOrderStatus status=WorkOrderStatus.UNDISPATCH;

    private WorkOrderRemiStatus reimburseStatus = WorkOrderRemiStatus.NOTREMBURSED;

    private Long contractId;

    private Boolean allin;

    private Double allinFee;

    private Double preReimburseAmount;

    //调度
    private String dispatcherIds;

    private Long dispatcherId;

    private Long netAreaId;

    private Boolean needQuote;

    private String memo;

    //+++++++++服务项++++++++++++
    private String catalogCode;

    private String desc;

    private String bigCatalogName;

    private String childCatalogName;

    private String brandArea;

    private String failure;

    private Double slaDuration;

    private ServiceCatalogLevel slaLevel=ServiceCatalogLevel.P6;

    private Date arriveTime;
    private Long arriveTimeAsLong;

    private String catalogMemo;

    private String dispatchMemo;

    private Boolean expired=false;

    //+++++++++服务项++++++++++++
    private Date createTime;
    private Long createTimeAsLong;
    private Date updateTime;
    private Long updateTimeAsLong;
    private String updater;

    private Date realStartTime;
    //实际结束时间
    private Date realEndTime;

    //+++++++++工单审批++++++++++++

    private ApplyType applyType;
    private Date applyTime;
    private Date approverTime;
    private Boolean rework=false;
    private String rejectReason;

    //是否先做后报，true为先做
    private Boolean doWithoutApply;
    //单位
    private String unit;
    //数量
    private Integer count=1;
    //紧急类型//预算报价/即刻报修/正常
    private UrgencyType urgencyType=UrgencyType.NORMAL;
    //是否在保
    private Boolean isInService;
    //维修方案编码
    private String catalogLevelFiveCode;
    //维修方案
    private String catalogLevelFiveName;
    //报价审核状态:未通过（默认）,已通过；
    private QuoteApproveStatus quoteApproveStatus=QuoteApproveStatus.UNAPPROVE;
    //迟到,true为迟到
    private Boolean delay=false;

    private ChargeWay chargeWay;

    //需要审批，工单审批管理的显示
    private Boolean needApprove=true;

    //报修时间
    private Date reportTime;
    private Long reportTimeAsLong;
    //是否申诉
    private Boolean appeal=false;

    public String getCatalogLevelFiveCode() {
        return catalogLevelFiveCode;
    }

    public void setCatalogLevelFiveCode(String catalogLevelFiveCode) {
        this.catalogLevelFiveCode = catalogLevelFiveCode;
    }

    public String getCatalogLevelFiveName() {
        return catalogLevelFiveName;
    }

    public void setCatalogLevelFiveName(String catalogLevelFiveName) {
        this.catalogLevelFiveName = catalogLevelFiveName;
    }
    public ServiceOrderSource getSource() {
        return source;
    }

    public void setSource(ServiceOrderSource source) {
        this.source = source;
    }

    public WorkOrderBillsSource getBillsSource() {
        return billsSource;
    }

    public void setBillsSource(WorkOrderBillsSource billsSource) {
        this.billsSource = billsSource;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }



    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Date getEstimatedStartTime() {
        return estimatedStartTime;
    }

    public void setEstimatedStartTime(Date estimatedStartTime) {
        this.estimatedStartTime = estimatedStartTime;
    }

    public Date getEstimatedEndTime() {
        return estimatedEndTime;
    }

    public void setEstimatedEndTime(Date estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime;
    }

    public String getReportMan() {
        return reportMan;
    }

    public void setReportMan(String reportMan) {
        this.reportMan = reportMan;
    }

    public String getReportManTel() {
        return reportManTel;
    }

    public void setReportManTel(String reportManTel) {
        this.reportManTel = reportManTel;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getCompanyBrandId() {
        return companyBrandId;
    }

    public void setCompanyBrandId(Long companyBrandId) {
        this.companyBrandId = companyBrandId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public ServiceOrderType getType() {
        return type;
    }

    public void setType(ServiceOrderType type) {
        this.type = type;
    }

    public WorkOrderStatus getStatus() {
        return status;
    }

    public void setStatus(WorkOrderStatus status) {
        this.status = status;
    }

    public WorkOrderRemiStatus getReimburseStatus() {
        return reimburseStatus;
    }

    public void setReimburseStatus(WorkOrderRemiStatus reimburseStatus) {
        this.reimburseStatus = reimburseStatus;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Boolean getAllin() {
        return allin;
    }

    public void setAllin(Boolean allin) {
        this.allin = allin;
    }

    public Double getAllinFee() {
        return allinFee;
    }

    public void setAllinFee(Double allinFee) {
        this.allinFee = allinFee;
    }

    public Double getPreReimburseAmount() {
        return preReimburseAmount;
    }

    public void setPreReimburseAmount(Double preReimburseAmount) {
        this.preReimburseAmount = preReimburseAmount;
    }

    public String getDispatcherIds() {
        return dispatcherIds;
    }

    public void setDispatcherIds(String dispatcherIds) {
        this.dispatcherIds = dispatcherIds;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Long getNetAreaId() {
        return netAreaId;
    }

    public void setNetAreaId(Long netAreaId) {
        this.netAreaId = netAreaId;
    }

    public Boolean getNeedQuote() {
        return needQuote;
    }

    public void setNeedQuote(Boolean needQuote) {
        this.needQuote = needQuote;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBigCatalogName() {
        return bigCatalogName;
    }

    public void setBigCatalogName(String bigCatalogName) {
        this.bigCatalogName = bigCatalogName;
    }

    public String getChildCatalogName() {
        return childCatalogName;
    }

    public void setChildCatalogName(String childCatalogName) {
        this.childCatalogName = childCatalogName;
    }

    public String getBrandArea() {
        return brandArea;
    }

    public void setBrandArea(String brandArea) {
        this.brandArea = brandArea;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public Double getSlaDuration() {
        return slaDuration;
    }

    public void setSlaDuration(Double slaDuration) {
        this.slaDuration = slaDuration;
    }

    public ServiceCatalogLevel getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(ServiceCatalogLevel slaLevel) {
        this.slaLevel = slaLevel;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getCatalogMemo() {
        return catalogMemo;
    }

    public void setCatalogMemo(String catalogMemo) {
        this.catalogMemo = catalogMemo;
    }

    public String getDispatchMemo() {
        return dispatchMemo;
    }

    public void setDispatchMemo(String dispatchMemo) {
        this.dispatchMemo = dispatchMemo;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    public Date getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
    }

    public ApplyType getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyType applyType) {
        this.applyType = applyType;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getApproverTime() {
        return approverTime;
    }

    public void setApproverTime(Date approverTime) {
        this.approverTime = approverTime;
    }

    public Boolean getRework() {
        return rework;
    }

    public void setRework(Boolean rework) {
        this.rework = rework;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public Boolean getDoWithoutApply() {
        return doWithoutApply;
    }

    public void setDoWithoutApply(Boolean doWithoutApply) {
        this.doWithoutApply = doWithoutApply;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public UrgencyType getUrgencyType() {
        return urgencyType;
    }

    public void setUrgencyType(UrgencyType urgencyType) {
        this.urgencyType = urgencyType;
    }

    public Boolean getIsInService() {
        return isInService;
    }

    public void getIsInService(Boolean isInService) {
        isInService = isInService;
    }

    public QuoteApproveStatus getQuoteApproveStatus() {
        return quoteApproveStatus;
    }

    public void setQuoteApproveStatus(QuoteApproveStatus quoteApproveStatus) {
        this.quoteApproveStatus = quoteApproveStatus;
    }

    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public ChargeWay getChargeWay() {
        return chargeWay;
    }

    public void setChargeWay(ChargeWay chargeWay) {
        this.chargeWay = chargeWay;
    }

    public Boolean getNeedApprove() {
        return needApprove;
    }

    public void setNeedApprove(Boolean needApprove) {
        this.needApprove = needApprove;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getInService() {
        return isInService;
    }

    public void setInService(Boolean inService) {
        isInService = inService;
    }

    public Boolean getAppeal() {
        return appeal;
    }

    public void setAppeal(Boolean appeal) {
        this.appeal = appeal;
    }


    public Long getEstimatedStartTimeAsLong() {
        return estimatedStartTimeAsLong;
    }

    public void setEstimatedStartTimeAsLong(Long estimatedStartTimeAsLong) {
        this.estimatedStartTimeAsLong = estimatedStartTimeAsLong;
    }

    public Long getEstimatedEndTimeAsLong() {
        return estimatedEndTimeAsLong;
    }

    public void setEstimatedEndTimeAsLong(Long estimatedEndTimeAsLong) {
        this.estimatedEndTimeAsLong = estimatedEndTimeAsLong;
    }

    public Long getArriveTimeAsLong() {
        return arriveTimeAsLong;
    }

    public void setArriveTimeAsLong(Long arriveTimeAsLong) {
        this.arriveTimeAsLong = arriveTimeAsLong;
    }

    public Long getCreateTimeAsLong() {
        return createTimeAsLong;
    }

    public void setCreateTimeAsLong(Long createTimeAsLong) {
        this.createTimeAsLong = createTimeAsLong;
    }

    public Long getUpdateTimeAsLong() {
        return updateTimeAsLong;
    }

    public void setUpdateTimeAsLong(Long updateTimeAsLong) {
        this.updateTimeAsLong = updateTimeAsLong;
    }

    public Long getReportTimeAsLong() {
        return reportTimeAsLong;
    }

    public void setReportTimeAsLong(Long reportTimeAsLong) {
        this.reportTimeAsLong = reportTimeAsLong;
    }
}
