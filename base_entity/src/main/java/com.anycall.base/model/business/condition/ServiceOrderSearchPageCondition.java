package com.anycall.base.model.business.condition;

import com.anycall.base.model.account.ServiceType;
import com.anycall.base.model.business.ReimburseStatusForServiceOrder;
import com.anycall.base.model.business.ServiceOrderSource;
import com.anycall.base.model.business.ServiceOrderStatus;
import com.anycall.base.model.business.ServiceOrderType;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;
import com.anycall.base.model.general.ServiceCatalogLevel;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class  ServiceOrderSearchPageCondition extends QuickSearchOrgPageCondition {


    private static final long serialVersionUID = 3174498679270172600L;

    private List<Long> orgTreeIds;

    private List<String> customerShopCodes;

    private Long companyId;

    private List<String> companyIds;

    private String customerShopCode;

    private String status;

    private String unstatus;

    private List<ServiceOrderStatus> statuses;

    private List<ServiceOrderStatus> unstatuses;

    private List<ServiceOrderSource> sources;

    private List<ServiceOrderType> types;

    private List<ServiceType> serviceTypes;

    private String serviceType;

    private String shopCode;

    private Long brandId;

    private List<Long> brandIds;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;

    private String catalogCode;

    private String thirdLevelCatalogCode;

    private Long supplierId;

    private String shopAuths;

    private String region;

    private String unregion;

    private Long stateId;

    private Long cityId;

    private Long districtId;

    //uniqlo

    private String urgencyType;

    private List<String> urgencyTypes;

    private String unUrgencyType;

    private List<String> unUrgencyTypes;

    private String serviceOrderNo;

    private String type;

    private Date startCreateTime;

    private Date endCreateTime;

    private String reportMan;

    private String otherServiceOrderNo;

    private String reportManTel;

    private Date startArriveTime;

    private Date endArriveTime;

    private Long dispatcherId;

    private Date startReportTime;

    private Date endReportTime;

    private Date startFinishTime;

    private Date endFinishTime;

    private Date startOpenTime;

    private Date endOpenTime;

    private String bigCatalogName;

    private String failure;

    private String desc;

    private String complete;
    private List<String> catalogCodes;

    private List<Long> serviceOrderIds;

    private String workerName;

    //开单号，用于查询从分拣单生成的服务单
    private String callOrderNo;

    //开单号组
    private List<String> callOrderNos;

    private String thirdPartyServiceOrderNo;
    private String timeFlag;
    private Date reportTime;
    private Boolean inService;

    private String userMemberType;

    private List<ServiceCatalogLevel> slaLevels;    //查紧急维修单
    private String overdueOrders; //查逾期单
    private List<ReimburseStatusForServiceOrder> choosedForServiceOrder;

    //维修备注，模糊搜素
    private String catalogMemo;

    private Long workOrderStaffId;

    private List<String> quotationOrderStatuses;
    private List<String> workOrderStatuses;
    //需要查询申诉，则传需要查询的申诉状态
    private List<String> appealSearchStatuses;
    //不需要申诉的，传true
    private Boolean notAppeal =false;
    //统包
    private String allIn;

    //图标查询
    private String chartType;

    private String chartText;

    private String chartDate = "day";
    private Boolean holding;

    public List<ServiceType> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<ServiceType> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public String getAllIn() {
        return allIn;
    }

    public void setAllIn(String allIn) {
        this.allIn = allIn;
    }

    public List<ReimburseStatusForServiceOrder> getChoosedForServiceOrder() {
        return choosedForServiceOrder;
    }

    public void setChoosedForServiceOrder(List<ReimburseStatusForServiceOrder> choosedForServiceOrder) {
        this.choosedForServiceOrder = choosedForServiceOrder;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Boolean getInService() {
        return inService;
    }

    public void setInService(Boolean inService) {
        this.inService = inService;
    }

    public String getThirdPartyServiceOrderNo() {
        return thirdPartyServiceOrderNo;
    }

    public void setThirdPartyServiceOrderNo(String thirdPartyServiceOrderNo) {
        this.thirdPartyServiceOrderNo = thirdPartyServiceOrderNo;
    }

    public String getTimeFlag() {
        return timeFlag;
    }

    public void setTimeFlag(String timeFlag) {
        this.timeFlag = timeFlag;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public List<String> getCustomerShopCodes() {
        return customerShopCodes;
    }

    public void setCustomerShopCodes(List<String> customerShopCodes) {
        this.customerShopCodes = customerShopCodes;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<String> getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(List<String> companyIds) {
        this.companyIds = companyIds;
    }

    public String getCustomerShopCode() {
        return customerShopCode;
    }

    public void setCustomerShopCode(String customerShopCode) {
        this.customerShopCode = customerShopCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnstatus() {
        return unstatus;
    }

    public void setUnstatus(String unstatus) {
        this.unstatus = unstatus;
    }

    public List<ServiceOrderStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<ServiceOrderStatus> statuses) {
        this.statuses = statuses;
    }

    public List<ServiceOrderStatus> getUnstatuses() {
        return unstatuses;
    }

    public void setUnstatuses(List<ServiceOrderStatus> unstatuses) {
        this.unstatuses = unstatuses;
    }

    public List<ServiceOrderSource> getSources() {
        return sources;
    }

    public void setSources(List<ServiceOrderSource> sources) {
        this.sources = sources;
    }

    public List<ServiceOrderType> getTypes() {
        return types;
    }

    public void setTypes(List<ServiceOrderType> types) {
        this.types = types;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public List<Long> getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(List<Long> brandIds) {
        this.brandIds = brandIds;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getThirdLevelCatalogCode() {
        return thirdLevelCatalogCode;
    }

    public void setThirdLevelCatalogCode(String thirdLevelCatalogCode) {
        this.thirdLevelCatalogCode = thirdLevelCatalogCode;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUnregion() {
        return unregion;
    }

    public void setUnregion(String unregion) {
        this.unregion = unregion;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getUrgencyType() {
        return urgencyType;
    }

    public void setUrgencyType(String urgencyType) {
        this.urgencyType = urgencyType;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Date startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public Date getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Date endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public String getReportMan() {
        return reportMan;
    }

    public void setReportMan(String reportMan) {
        this.reportMan = reportMan;
    }

    public String getOtherServiceOrderNo() {
        return otherServiceOrderNo;
    }

    public void setOtherServiceOrderNo(String otherServiceOrderNo) {
        this.otherServiceOrderNo = otherServiceOrderNo;
    }

    public String getReportManTel() {
        return reportManTel;
    }

    public void setReportManTel(String reportManTel) {
        this.reportManTel = reportManTel;
    }

    public Date getStartArriveTime() {
        return startArriveTime;
    }

    public void setStartArriveTime(Date startArriveTime) {
        this.startArriveTime = startArriveTime;
    }

    public Date getEndArriveTime() {
        return endArriveTime;
    }

    public void setEndArriveTime(Date endArriveTime) {
        this.endArriveTime = endArriveTime;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Date getStartReportTime() {
        return startReportTime;
    }

    public void setStartReportTime(Date startReportTime) {
        this.startReportTime = startReportTime;
    }

    public Date getEndReportTime() {
        return endReportTime;
    }

    public void setEndReportTime(Date endReportTime) {
        this.endReportTime = endReportTime;
    }

    public Date getStartFinishTime() {
        return startFinishTime;
    }

    public void setStartFinishTime(Date startFinishTime) {
        this.startFinishTime = startFinishTime;
    }

    public Date getEndFinishTime() {
        return endFinishTime;
    }

    public void setEndFinishTime(Date endFinishTime) {
        this.endFinishTime = endFinishTime;
    }

    public Date getStartOpenTime() {
        return startOpenTime;
    }

    public void setStartOpenTime(Date startOpenTime) {
        this.startOpenTime = startOpenTime;
    }

    public Date getEndOpenTime() {
        return endOpenTime;
    }

    public void setEndOpenTime(Date endOpenTime) {
        this.endOpenTime = endOpenTime;
    }

    public String getBigCatalogName() {
        return bigCatalogName;
    }

    public void setBigCatalogName(String bigCatalogName) {
        this.bigCatalogName = bigCatalogName;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public List<String> getCatalogCodes() {
        return catalogCodes;
    }

    public void setCatalogCodes(List<String> catalogCodes) {
        this.catalogCodes = catalogCodes;
    }

    public List<Long> getServiceOrderIds() {
        return serviceOrderIds;
    }

    public void setServiceOrderIds(List<Long> serviceOrderIds) {
        this.serviceOrderIds = serviceOrderIds;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getCallOrderNo() {
        return callOrderNo;
    }

    public void setCallOrderNo(String callOrderNo) {
        this.callOrderNo = callOrderNo;
    }

    public String getUserMemberType() {
        return userMemberType;
    }

    public void setUserMemberType(String userMemberType) {
        this.userMemberType = userMemberType;
    }

    public List<ServiceCatalogLevel> getSlaLevels() {
        return slaLevels;
    }

    public void setSlaLevels(List<ServiceCatalogLevel> slaLevels) {
        this.slaLevels = slaLevels;
    }

    public String getOverdueOrders() {
        return overdueOrders;
    }

    public void setOverdueOrders(String overdueOrders) {
        this.overdueOrders = overdueOrders;
    }

    public String getUnUrgencyType() {
        return unUrgencyType;
    }

    public void setUnUrgencyType(String unUrgencyType) {
        this.unUrgencyType = unUrgencyType;
    }

    public String getCatalogMemo() {
        return catalogMemo;
    }

    public void setCatalogMemo(String catalogMemo) {
        this.catalogMemo = catalogMemo;
    }

    public List<String> getUrgencyTypes() {
        return urgencyTypes;
    }

    public void setUrgencyTypes(List<String> urgencyTypes) {
        this.urgencyTypes = urgencyTypes;
    }

    public List<String> getUnUrgencyTypes() {
        return unUrgencyTypes;
    }

    public void setUnUrgencyTypes(List<String> unUrgencyTypes) {
        this.unUrgencyTypes = unUrgencyTypes;
    }

    public Long getWorkOrderStaffId() {
        return workOrderStaffId;
    }

    public void setWorkOrderStaffId(Long workOrderStaffId) {
        this.workOrderStaffId = workOrderStaffId;
    }

    public List<String> getQuotationOrderStatuses() {
        return quotationOrderStatuses;
    }

    public void setQuotationOrderStatuses(List<String> quotationOrderStatuses) {
        this.quotationOrderStatuses = quotationOrderStatuses;
    }

    public List<String> getWorkOrderStatuses() {
        return workOrderStatuses;
    }

    public void setWorkOrderStatuses(List<String> workOrderStatuses) {
        this.workOrderStatuses = workOrderStatuses;
    }

    public List<String> getAppealSearchStatuses() {
        return appealSearchStatuses;
    }

    public void setAppealSearchStatuses(List<String> appealSearchStatuses) {
        this.appealSearchStatuses = appealSearchStatuses;
    }

    public Boolean getNotAppeal() {
        return notAppeal;
    }

    public void setNotAppeal(Boolean notAppeal) {
        this.notAppeal = notAppeal;
    }

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getChartText() {
        return chartText;
    }

    public void setChartText(String chartText) {
        this.chartText = chartText;
    }

    public String getChartDate() {
        return chartDate;
    }

    public void setChartDate(String chartDate) {
        this.chartDate = chartDate;
    }

    public List<String> getCallOrderNos() {
        return callOrderNos;
    }

    public void setCallOrderNos(List<String> callOrderNos) {
        this.callOrderNos = callOrderNos;
    }

    public Boolean getHolding() {
        return holding;
    }

    public void setHolding(Boolean holding) {
        this.holding = holding;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceOrderSearchPageCondition that = (ServiceOrderSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(customerShopCodes, that.customerShopCodes) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(companyIds, that.companyIds) &&
                Objects.equals(customerShopCode, that.customerShopCode) &&
                Objects.equals(status, that.status) &&
                Objects.equals(unstatus, that.unstatus) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(unstatuses, that.unstatuses) &&
                Objects.equals(sources, that.sources) &&
                Objects.equals(types, that.types) &&
                Objects.equals(serviceTypes, that.serviceTypes) &&
                Objects.equals(serviceType, that.serviceType) &&
                Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(brandIds, that.brandIds) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(catalogCode, that.catalogCode) &&
                Objects.equals(thirdLevelCatalogCode, that.thirdLevelCatalogCode) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(region, that.region) &&
                Objects.equals(unregion, that.unregion) &&
                Objects.equals(stateId, that.stateId) &&
                Objects.equals(cityId, that.cityId) &&
                Objects.equals(districtId, that.districtId) &&
                Objects.equals(urgencyType, that.urgencyType) &&
                Objects.equals(urgencyTypes, that.urgencyTypes) &&
                Objects.equals(unUrgencyType, that.unUrgencyType) &&
                Objects.equals(unUrgencyTypes, that.unUrgencyTypes) &&
                Objects.equals(serviceOrderNo, that.serviceOrderNo) &&
                Objects.equals(type, that.type) &&
                Objects.equals(startCreateTime, that.startCreateTime) &&
                Objects.equals(endCreateTime, that.endCreateTime) &&
                Objects.equals(reportMan, that.reportMan) &&
                Objects.equals(otherServiceOrderNo, that.otherServiceOrderNo) &&
                Objects.equals(reportManTel, that.reportManTel) &&
                Objects.equals(startArriveTime, that.startArriveTime) &&
                Objects.equals(endArriveTime, that.endArriveTime) &&
                Objects.equals(dispatcherId, that.dispatcherId) &&
                Objects.equals(startReportTime, that.startReportTime) &&
                Objects.equals(endReportTime, that.endReportTime) &&
                Objects.equals(startFinishTime, that.startFinishTime) &&
                Objects.equals(endFinishTime, that.endFinishTime) &&
                Objects.equals(startOpenTime, that.startOpenTime) &&
                Objects.equals(endOpenTime, that.endOpenTime) &&
                Objects.equals(bigCatalogName, that.bigCatalogName) &&
                Objects.equals(failure, that.failure) &&
                Objects.equals(desc, that.desc) &&
                Objects.equals(complete, that.complete) &&
                Objects.equals(catalogCodes, that.catalogCodes) &&
                Objects.equals(serviceOrderIds, that.serviceOrderIds) &&
                Objects.equals(workerName, that.workerName) &&
                Objects.equals(callOrderNo, that.callOrderNo) &&
                Objects.equals(callOrderNos, that.callOrderNos) &&
                Objects.equals(thirdPartyServiceOrderNo, that.thirdPartyServiceOrderNo) &&
                Objects.equals(timeFlag, that.timeFlag) &&
                Objects.equals(reportTime, that.reportTime) &&
                Objects.equals(inService, that.inService) &&
                Objects.equals(userMemberType, that.userMemberType) &&
                Objects.equals(slaLevels, that.slaLevels) &&
                Objects.equals(overdueOrders, that.overdueOrders) &&
                Objects.equals(choosedForServiceOrder, that.choosedForServiceOrder) &&
                Objects.equals(catalogMemo, that.catalogMemo) &&
                Objects.equals(workOrderStaffId, that.workOrderStaffId) &&
                Objects.equals(quotationOrderStatuses, that.quotationOrderStatuses) &&
                Objects.equals(workOrderStatuses, that.workOrderStatuses) &&
                Objects.equals(appealSearchStatuses, that.appealSearchStatuses) &&
                Objects.equals(notAppeal, that.notAppeal) &&
                Objects.equals(allIn, that.allIn) &&
                Objects.equals(chartType, that.chartType) &&
                Objects.equals(chartText, that.chartText) &&
                Objects.equals(chartDate, that.chartDate) &&
                Objects.equals(holding, that.holding);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orgTreeIds, customerShopCodes, companyId, companyIds, customerShopCode, status, unstatus, statuses, unstatuses, sources, types, serviceTypes, serviceType, shopCode, brandId, brandIds, startTime, endTime, catalogCode, thirdLevelCatalogCode, supplierId, shopAuths, region, unregion, stateId, cityId, districtId, urgencyType, urgencyTypes, unUrgencyType, unUrgencyTypes, serviceOrderNo, type, startCreateTime, endCreateTime, reportMan, otherServiceOrderNo, reportManTel, startArriveTime, endArriveTime, dispatcherId, startReportTime, endReportTime, startFinishTime, endFinishTime, startOpenTime, endOpenTime, bigCatalogName, failure, desc, complete, catalogCodes, serviceOrderIds, workerName, callOrderNo, callOrderNos, thirdPartyServiceOrderNo, timeFlag, reportTime, inService, userMemberType, slaLevels, overdueOrders, choosedForServiceOrder, catalogMemo, workOrderStaffId, quotationOrderStatuses, workOrderStatuses, appealSearchStatuses, notAppeal, allIn, chartType, chartText, chartDate, holding);
    }
}
