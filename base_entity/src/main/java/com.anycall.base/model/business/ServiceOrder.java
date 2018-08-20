package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.ServiceCatalogLevel;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Robin on 16/8/30.
 */
public class ServiceOrder  extends AbstractPersistable {

    private static final long serialVersionUID = -891595910462902680L;

    private ServiceOrderSource source=ServiceOrderSource.CALL;

    private ServiceOrderBillsSource billsSource;

    private String serviceOrderNo;

    private String reportMan;

    private String reportManTel;

    private Long supplierId;

    private Long companyBrandId;

    private Long companyId;

    private String shopCode;

    private ServiceOrderType type=ServiceOrderType.REPAIR;

    private ServiceOrderStatus status=ServiceOrderStatus.REPORTED;

    private ReimburseStatusForServiceOrder reimburseStatus=ReimburseStatusForServiceOrder.UNREIMBURSE;

    private Long contractId;
//是否统包
    //门店是否统包
    private Boolean allin;

    //调度
    private String dispatcherIds;

    private Long dispatcherId;

    private Long netAreaId;

    //是否需要报价（判断服务单是否统包，需要报价true就不是统包）
    private Boolean needQuote;

    private String memo;

    //+++++++++服务项++++++++++++
    private String thirdLevelCatalogCode;

    private String catalogCode;

    private String desc;

    private String bigCatalogName;

    private String childCatalogName;

    private String brandArea;

    private String failure;

    //sal工时
    private Double slaDuration;

    private ServiceCatalogLevel slaLevel=ServiceCatalogLevel.P6;

    //实际应到时间
    private Date arriveTime;
    private Boolean arriveTimeChangable=false;
    private String catalogMemo;

    private Boolean expired=false;

    //+++++++++服务项++++++++++++

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
    private Date createTime;

    private Date updateTime;

    private String updater;

    //第一次到场(签到)时间
    private Date firstStartTime;

    //服务单完成时间
    private Date finishTime;

    //返修
    private Boolean rework=false;

    //应完成时间=实际应到时间+服务工时
    private Date requireFinishTime;

    //是否先做后报，true为先做
    private Boolean doWithoutApply;
    //单位
    private String unit;
    //数量
    private Integer count=1;
    //完工确认数
    private Integer confirmCount;
    //紧急类型，//预算报价/即刻报修/正常/禀议
    private UrgencyType urgencyType=UrgencyType.NORMAL;
    //是否在保
    private Boolean isInService;

    private String rejectReason;
    //门店确认完工
    private ServiceOrderComplete complete=ServiceOrderComplete.NONE;
    //评价
    private String comment;
    //申诉原因
    private String appealReason;
    //客服id
    private Long supporterId;
    //维修方案编码
    private String catalogLevelFiveCode;
    //维修方案
    private String catalogLevelFiveName;

    //第三方服务单编号
    private String  thirdPartyServiceOrderNo;

    //第三方服务单状态
    private String  thirdPartyServiceOrderStatus;
    //取消理由
    private String cancelReason;
    //取消理由选项
    private String cancelReasonOption;
    //报修时间
    private Date reportTime;
    //分拣单号
    private String sortNo;
    //版本
    private Integer version;
    //报价单Id，暂定为最后一个报价单Id，报价单创建时更新这个字段
    private Long quotationOrderId;
    //工单Id，暂定为最后一个工单单Id，工单创建时更新这个字段
    private Long workOrderId;
    //是否申诉
    private Boolean appeal=false;
    //申诉驳回原因
    private String appealRejectReason;
    //申诉单来源
    private Long fromServiceOrderId;
    //待办
    private Boolean holding = false;
    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

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
    public Long getSupporterId() {
        return supporterId;
    }

    public void setSupporterId(Long supporterId) {
        this.supporterId = supporterId;
    }

    public ReimburseStatusForServiceOrder getReimburseStatus() {
        return reimburseStatus;
    }

    public void setReimburseStatus(ReimburseStatusForServiceOrder reimburseStatus) {
        this.reimburseStatus = reimburseStatus;
    }

    public ServiceOrderSource getSource() {
        return source;
    }

    public void setSource(ServiceOrderSource source) {
        this.source = source;
    }

    public ServiceOrderBillsSource getBillsSource() {
        return billsSource;
    }

    public void setBillsSource(ServiceOrderBillsSource billsSource) {
        this.billsSource = billsSource;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
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

    public ServiceOrderStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceOrderStatus status) {
        this.status = status;
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

    public Boolean getArriveTimeChangable() {
        return arriveTimeChangable;
    }

    public void setArriveTimeChangable(Boolean arriveTimeChangable) {
        this.arriveTimeChangable = arriveTimeChangable;
    }

    public String getCatalogMemo() {
        return catalogMemo;
    }

    public void setCatalogMemo(String catalogMemo) {
        this.catalogMemo = catalogMemo;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFirstStartTime() {
        return firstStartTime;
    }

    public void setFirstStartTime(Date firstStartTime) {
        this.firstStartTime = firstStartTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getDispatcherIds() {
        return dispatcherIds;
    }

    public void setDispatcherIds(String dispatcherIds) {
        this.dispatcherIds = dispatcherIds;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Boolean getRework() {
        return rework;
    }

    public void setRework(Boolean rework) {
        this.rework = rework;
    }

    public Date getRequireFinishTime() {
        return requireFinishTime;
    }

    public void setRequireFinishTime(Date requireFinishTime) {
        this.requireFinishTime = requireFinishTime;
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

    public Integer getConfirmCount() {
        return confirmCount;
    }

    public void setConfirmCount(Integer confirmCount) {
        this.confirmCount = confirmCount;
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

    public void setIsInService(Boolean inService) {
        isInService = inService;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public ServiceOrderComplete getComplete() {
        return complete;
    }

    public void setComplete(ServiceOrderComplete complete) {
        this.complete = complete;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAppealReason() {
        return appealReason;
    }

    public void setAppealReason(String appealReason) {
        this.appealReason = appealReason;
    }

    public String getThirdLevelCatalogCode() {
        return thirdLevelCatalogCode;
    }

    public void setThirdLevelCatalogCode(String thirdLevelCatalogCode) {
        this.thirdLevelCatalogCode = thirdLevelCatalogCode;
    }

    public Boolean getInService() {
        return isInService;
    }

    public void setInService(Boolean inService) {
        isInService = inService;
    }

    public String getThirdPartyServiceOrderNo() {
        return thirdPartyServiceOrderNo;
    }

    public void setThirdPartyServiceOrderNo(String thirdPartyServiceOrderNo) {
        this.thirdPartyServiceOrderNo = thirdPartyServiceOrderNo;
    }

    public String getThirdPartyServiceOrderStatus() {
        return thirdPartyServiceOrderStatus;
    }

    public void setThirdPartyServiceOrderStatus(String thirdPartyServiceOrderStatus) {
        this.thirdPartyServiceOrderStatus = thirdPartyServiceOrderStatus;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getSortNo() {
        return sortNo;
    }

    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Boolean getAppeal() {
        return appeal;
    }

    public void setAppeal(Boolean appeal) {
        this.appeal = appeal;
    }

    public String getAppealRejectReason() {
        return appealRejectReason;
    }

    public void setAppealRejectReason(String appealRejectReason) {
        this.appealRejectReason = appealRejectReason;
    }

    public Long getFromServiceOrderId() {
        return fromServiceOrderId;
    }

    public void setFromServiceOrderId(Long fromServiceOrderId) {
        this.fromServiceOrderId = fromServiceOrderId;
    }

    public Boolean getHolding() {
        return holding;
    }

    public void setHolding(Boolean holding) {
        this.holding = holding;
    }

    public String getCancelReasonOption() {
        return cancelReasonOption;
    }

    public void setCancelReasonOption(String cancelReasonOption) {
        this.cancelReasonOption = cancelReasonOption;
    }
}
