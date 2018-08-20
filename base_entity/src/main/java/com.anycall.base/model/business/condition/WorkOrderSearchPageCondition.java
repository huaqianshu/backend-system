package com.anycall.base.model.business.condition;

import com.anycall.base.model.business.WorkOrderStatus;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class WorkOrderSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -6798778784009332629L;
    private List<Long> orgTreeIds;

    private Long companyId;

    private String status;

    private Long serviceOrderId;

    private String workOrderNo;

    private Long workOrderId;

    private List<WorkOrderStatus> statuses;

    private List<WorkOrderStatus> unstatuses;

    private String shopCode;

    private Long brandId;

    private List<Long> brandIds;

    private Long dispatcherId;

    private String reimburseStatus;

    private Long staffId;

    //一个数字，从今天起查询几天，例如：1就是今天
    private Integer searchDay;

    //一个日期，查询当天
    private Date day;
    private Date createTime;
    //一个时间段
    private Date startDay;
    private Date endDay;

    private String whetherOffer;

    private String applyType;

    private String shopAuths;

    private String type;

    private String quoteApproveStatus;

    private String urgencyType;

    private String timeFlag;

    //(不为空时，查优衣库经理未派工的工单)
    private String uniUnDispatch;

    private Integer overdueTime;

    private String userIdentifyType;

    private String userMemberType;

    private Long userDispatcherId;

    private Boolean delay;

    private Boolean needApprove;

    private Long uniDispatcherId;


    //报修时间段查询
    private Date startReportTime;

    private Date endReportTime;

    //预估起始时间段查询
    private Date startEstimatedStartTime;

    private Date endEstimatedStartTime;

    //预估结束时间段查询
    private Date startEstimatedEndTime;

    private Date endEstimatedEndTime;

    //实际应到时间段查询
    private Date startArriveTime;

    private Date endArriveTime;

    private Long supplierId;

    //查询可以派工
    private Boolean searchOrderSend=false;

    //区域查询
    private String region;

    private Long stateId;

    private Long cityId;

    private Long districtId;
    private String dashBoardDispatcherId;

    //是否申诉
    private Boolean appeal;
    //出库单的查询条件（保证一个工单只有一个出库单）
    private Boolean simpleWorkOrder;

    private Boolean expired;
    //ServiceType {
//    //设备、设施、设备和设施
//    EQUIPMENT,FACILITY,EQUIPMENT_FACILITY;
    private String contractType;

    private Date startCreateTime;

    private Date endCreateTime;
//ServiceOrderType {
//   //维修//保养//巡检//工程项目
//   REPAIR,MAINTAIN,INSPECT,PROJECT
    //对应workorder type字段
    private String serviceType;

    public Boolean getSimpleWorkOrder() {
        return simpleWorkOrder;
    }

    public void setSimpleWorkOrder(Boolean simpleWorkOrder) {
        this.simpleWorkOrder = simpleWorkOrder;
    }

    public Boolean getAppeal() {
        return appeal;
    }

    public void setAppeal(Boolean appeal) {
        this.appeal = appeal;
    }

    public String getDashBoardDispatcherId() {
        return dashBoardDispatcherId;
    }

    public void setDashBoardDispatcherId(String dashBoardDispatcherId) {
        this.dashBoardDispatcherId = dashBoardDispatcherId;
    }

    public String getTimeFlag() {
        return timeFlag;
    }

    public void setTimeFlag(String timeFlag) {
        this.timeFlag = timeFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public List<WorkOrderStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<WorkOrderStatus> statuses) {
        this.statuses = statuses;
    }

    public List<WorkOrderStatus> getUnstatuses() {
        return unstatuses;
    }

    public void setUnstatuses(List<WorkOrderStatus> unstatuses) {
        this.unstatuses = unstatuses;
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

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public String getReimburseStatus() {
        return reimburseStatus;
    }

    public void setReimburseStatus(String reimburseStatus) {
        this.reimburseStatus = reimburseStatus;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Integer getSearchDay() {
        return searchDay;
    }

    public void setSearchDay(Integer searchDay) {
        this.searchDay = searchDay;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public String getWhetherOffer() {
        return whetherOffer;
    }

    public void setWhetherOffer(String whetherOffer) {
        this.whetherOffer = whetherOffer;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getQuoteApproveStatus() {
        return quoteApproveStatus;
    }

    public void setQuoteApproveStatus(String quoteApproveStatus) {
        this.quoteApproveStatus = quoteApproveStatus;
    }

    public String getUrgencyType() {
        return urgencyType;
    }

    public void setUrgencyType(String urgencyType) {
        this.urgencyType = urgencyType;
    }

    public String getUniUnDispatch() {
        return uniUnDispatch;
    }

    public void setUniUnDispatch(String uniUnDispatch) {
        this.uniUnDispatch = uniUnDispatch;
    }

    public Integer getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(Integer overdueTime) {
        this.overdueTime = overdueTime;
    }

    public String getUserIdentifyType() {
        return userIdentifyType;
    }

    public void setUserIdentifyType(String userIdentifyType) {
        this.userIdentifyType = userIdentifyType;
    }

    public String getUserMemberType() {
        return userMemberType;
    }

    public void setUserMemberType(String userMemberType) {
        this.userMemberType = userMemberType;
    }

    public Long getUserDispatcherId() {
        return userDispatcherId;
    }

    public void setUserDispatcherId(Long userDispatcherId) {
        this.userDispatcherId = userDispatcherId;
    }

    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public Boolean getNeedApprove() {
        return needApprove;
    }

    public void setNeedApprove(Boolean needApprove) {
        this.needApprove = needApprove;
    }

    public Long getUniDispatcherId() {
        return uniDispatcherId;
    }

    public void setUniDispatcherId(Long uniDispatcherId) {
        this.uniDispatcherId = uniDispatcherId;
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

    public Date getStartEstimatedStartTime() {
        return startEstimatedStartTime;
    }

    public void setStartEstimatedStartTime(Date startEstimatedStartTime) {
        this.startEstimatedStartTime = startEstimatedStartTime;
    }

    public Date getEndEstimatedStartTime() {
        return endEstimatedStartTime;
    }

    public void setEndEstimatedStartTime(Date endEstimatedStartTime) {
        this.endEstimatedStartTime = endEstimatedStartTime;
    }

    public Date getStartEstimatedEndTime() {
        return startEstimatedEndTime;
    }

    public void setStartEstimatedEndTime(Date startEstimatedEndTime) {
        this.startEstimatedEndTime = startEstimatedEndTime;
    }

    public Date getEndEstimatedEndTime() {
        return endEstimatedEndTime;
    }

    public void setEndEstimatedEndTime(Date endEstimatedEndTime) {
        this.endEstimatedEndTime = endEstimatedEndTime;
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

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Boolean getSearchOrderSend() {
        return searchOrderSend;
    }

    public void setSearchOrderSend(Boolean searchOrderSend) {
        this.searchOrderSend = searchOrderSend;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
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
        WorkOrderSearchPageCondition condition = (WorkOrderSearchPageCondition) o;
        return Objects.equals(orgTreeIds, condition.orgTreeIds) &&
                Objects.equals(companyId, condition.companyId) &&
                Objects.equals(status, condition.status) &&
                Objects.equals(serviceOrderId, condition.serviceOrderId) &&
                Objects.equals(workOrderNo, condition.workOrderNo) &&
                Objects.equals(workOrderId, condition.workOrderId) &&
                Objects.equals(statuses, condition.statuses) &&
                Objects.equals(unstatuses, condition.unstatuses) &&
                Objects.equals(shopCode, condition.shopCode) &&
                Objects.equals(brandId, condition.brandId) &&
                Objects.equals(brandIds, condition.brandIds) &&
                Objects.equals(dispatcherId, condition.dispatcherId) &&
                Objects.equals(reimburseStatus, condition.reimburseStatus) &&
                Objects.equals(staffId, condition.staffId) &&
                Objects.equals(searchDay, condition.searchDay) &&
                Objects.equals(day, condition.day) &&
                Objects.equals(createTime, condition.createTime) &&
                Objects.equals(startDay, condition.startDay) &&
                Objects.equals(endDay, condition.endDay) &&
                Objects.equals(whetherOffer, condition.whetherOffer) &&
                Objects.equals(applyType, condition.applyType) &&
                Objects.equals(shopAuths, condition.shopAuths) &&
                Objects.equals(type, condition.type) &&
                Objects.equals(quoteApproveStatus, condition.quoteApproveStatus) &&
                Objects.equals(urgencyType, condition.urgencyType) &&
                Objects.equals(timeFlag, condition.timeFlag) &&
                Objects.equals(uniUnDispatch, condition.uniUnDispatch) &&
                Objects.equals(overdueTime, condition.overdueTime) &&
                Objects.equals(userIdentifyType, condition.userIdentifyType) &&
                Objects.equals(userMemberType, condition.userMemberType) &&
                Objects.equals(userDispatcherId, condition.userDispatcherId) &&
                Objects.equals(delay, condition.delay) &&
                Objects.equals(needApprove, condition.needApprove) &&
                Objects.equals(uniDispatcherId, condition.uniDispatcherId) &&
                Objects.equals(startReportTime, condition.startReportTime) &&
                Objects.equals(endReportTime, condition.endReportTime) &&
                Objects.equals(startEstimatedStartTime, condition.startEstimatedStartTime) &&
                Objects.equals(endEstimatedStartTime, condition.endEstimatedStartTime) &&
                Objects.equals(startEstimatedEndTime, condition.startEstimatedEndTime) &&
                Objects.equals(endEstimatedEndTime, condition.endEstimatedEndTime) &&
                Objects.equals(startArriveTime, condition.startArriveTime) &&
                Objects.equals(endArriveTime, condition.endArriveTime) &&
                Objects.equals(supplierId, condition.supplierId) &&
                Objects.equals(searchOrderSend, condition.searchOrderSend) &&
                Objects.equals(region, condition.region) &&
                Objects.equals(stateId, condition.stateId) &&
                Objects.equals(cityId, condition.cityId) &&
                Objects.equals(districtId, condition.districtId) &&
                Objects.equals(dashBoardDispatcherId, condition.dashBoardDispatcherId) &&
                Objects.equals(appeal, condition.appeal) &&
                Objects.equals(simpleWorkOrder, condition.simpleWorkOrder) &&
                Objects.equals(expired, condition.expired) &&
                Objects.equals(contractType, condition.contractType) &&
                Objects.equals(startCreateTime, condition.startCreateTime) &&
                Objects.equals(endCreateTime, condition.endCreateTime) &&
                Objects.equals(serviceType, condition.serviceType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orgTreeIds, companyId, status, serviceOrderId, workOrderNo, workOrderId, statuses, unstatuses, shopCode, brandId, brandIds, dispatcherId, reimburseStatus, staffId, searchDay, day, createTime, startDay, endDay, whetherOffer, applyType, shopAuths, type, quoteApproveStatus, urgencyType, timeFlag, uniUnDispatch, overdueTime, userIdentifyType, userMemberType, userDispatcherId, delay, needApprove, uniDispatcherId, startReportTime, endReportTime, startEstimatedStartTime, endEstimatedStartTime, startEstimatedEndTime, endEstimatedEndTime, startArriveTime, endArriveTime, supplierId, searchOrderSend, region, stateId, cityId, districtId, dashBoardDispatcherId, appeal, simpleWorkOrder, expired, contractType, startCreateTime, endCreateTime, serviceType);
    }
}
