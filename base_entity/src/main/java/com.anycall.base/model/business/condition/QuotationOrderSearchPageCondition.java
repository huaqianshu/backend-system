package com.anycall.base.model.business.condition;

import com.anycall.base.model.account.MemberType;
import com.anycall.base.model.account.ServiceType;
import com.anycall.base.model.business.UrgencyType;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class QuotationOrderSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -3970575703844224692L;

    private List<Long> orgTreeIds;

    private List<String> shopCodes;

    private String customerShopCode;

    private Long quotationOrderId;

    private Long mergeQuotationOrderId;

    private String quotationOrderNo;

    private String workOrderNo;

    private String serviceOrderNo;

    private String serviceOrderStatus;

    //报价单对应的服务单不是这个状态的
    private String unServiceOrderStatus;

    //创建时间
    private Date createTime;

    //结束时间
    private Date endTime;

    private Date submitTime;

    //制单人
    private String producer;

    //用于查询审批人
    private String updater;

    //隐藏取消
    private Boolean hidecancel;

    //控制已合并的报价单
    private Boolean merge;

    private Boolean cusmerge;

    //检索原始的报价单
    private Boolean isBlankServiceOrderId;

    //公司
    private Long companyId;

    private List<String> companyIds;

    //品牌
    private Long companyBrandId;

    //门店
    private String shopCode;

    //是否先做后补
    private Boolean doOrUse;

    private Boolean confirmSingle;

    private List<String> region;

    private Long stateId;

    private Long cityId;

    private Long districtId;

    //状态
    private List<String> quotationStatus;

    private List<String> unQuotationStatus;

    private String  settlementStatus;

    private String shopAuths;

    private Date reviewStartTime;

    private Date reviewEndTime;

    private Date createStartTime;

    private Date createEndTime;

    private Date serviceOrderReportStartTime;//报修

    private Date serviceOrderReportEndTime;

    private Date serviceOrderFinishStartTime;//完成

    private Date serviceOrderFinishEndTime;

    private Boolean affirmSearchCustomer=true;

    private Boolean settlementSearch=false;

    private MemberType memberType;

    private Boolean uniExport;

    private String type;

    private String dateType;

    private Boolean notMergeShop;

    private Boolean notTimely = true;

    private List<Long> quotationOrderIds;

    private List<UrgencyType> urgencyTypes;

    private List<ServiceType> serviceTypes;

    private String userMemberType;
    private Boolean mergeQuotationOrderIdNull;//如果查合并单这个给true(create By Hachi)
    private Boolean mergeQuotationOrderNoNull;
    private Boolean merged;//如果查合并单这个给true(create By Hachi)
    private Boolean timeOut;
    private Boolean qureyPretrialTime;
    private Boolean costUpload;

    //call单号
    private String callNo;

    private String searchType;

    public Boolean getMergeQuotationOrderNoNull() {
        return mergeQuotationOrderNoNull;
    }

    public void setMergeQuotationOrderNoNull(Boolean mergeQuotationOrderNoNull) {
        this.mergeQuotationOrderNoNull = mergeQuotationOrderNoNull;
    }

    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public List<UrgencyType> getUrgencyTypes() {
        return urgencyTypes;
    }

    public void setUrgencyTypes(List<UrgencyType> urgencyTypes) {
        this.urgencyTypes = urgencyTypes;
    }

    public Boolean getBlankServiceOrderId() {
        return isBlankServiceOrderId;
    }

    public void setBlankServiceOrderId(Boolean blankServiceOrderId) {
        isBlankServiceOrderId = blankServiceOrderId;
    }


    public Boolean getMergeQuotationOrderIdNull() {
        return mergeQuotationOrderIdNull;
    }

    public void setMergeQuotationOrderIdNull(Boolean mergeQuotationOrderIdNull) {
        this.mergeQuotationOrderIdNull = mergeQuotationOrderIdNull;
    }

    public Long getMergeQuotationOrderId() {
        return mergeQuotationOrderId;
    }

    public void setMergeQuotationOrderId(Long mergeQuotationOrderId) {
        this.mergeQuotationOrderId = mergeQuotationOrderId;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getCustomerShopCode() {
        return customerShopCode;
    }

    public void setCustomerShopCode(String customerShopCode) {
        this.customerShopCode = customerShopCode;
    }

    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
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

    public String getServiceOrderStatus() {
        return serviceOrderStatus;
    }

    public void setServiceOrderStatus(String serviceOrderStatus) {
        this.serviceOrderStatus = serviceOrderStatus;
    }

    public String getUnServiceOrderStatus() {
        return unServiceOrderStatus;
    }

    public void setUnServiceOrderStatus(String unServiceOrderStatus) {
        this.unServiceOrderStatus = unServiceOrderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Boolean getHidecancel() {
        return hidecancel;
    }

    public void setHidecancel(Boolean hidecancel) {
        this.hidecancel = hidecancel;
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

    public Boolean getDoOrUse() {
        return doOrUse;
    }

    public void setDoOrUse(Boolean doOrUse) {
        this.doOrUse = doOrUse;
    }

    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
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

    public List<String> getQuotationStatus() {
        return quotationStatus;
    }

    public void setQuotationStatus(List<String> quotationStatus) {
        this.quotationStatus = quotationStatus;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }

    public Boolean getMerge() {
        return merge;
    }

    public void setMerge(Boolean merge) {
        this.merge = merge;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public List<String> getShopCodes() {
        return shopCodes;
    }

    public void setShopCodes(List<String> shopCodes) {
        this.shopCodes = shopCodes;
    }

    public Boolean getCusmerge() {
        return cusmerge;
    }

    public void setCusmerge(Boolean cusmerge) {
        this.cusmerge = cusmerge;
    }

    public Date getReviewStartTime() {
        return reviewStartTime;
    }

    public void setReviewStartTime(Date reviewStartTime) {
        this.reviewStartTime = reviewStartTime;
    }

    public Date getReviewEndTime() {
        return reviewEndTime;
    }

    public void setReviewEndTime(Date reviewEndTime) {
        this.reviewEndTime = reviewEndTime;
    }

    public Date getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }

    public Date getServiceOrderReportStartTime() {
        return serviceOrderReportStartTime;
    }

    public void setServiceOrderReportStartTime(Date serviceOrderReportStartTime) {
        this.serviceOrderReportStartTime = serviceOrderReportStartTime;
    }

    public Date getServiceOrderReportEndTime() {
        return serviceOrderReportEndTime;
    }

    public void setServiceOrderReportEndTime(Date serviceOrderReportEndTime) {
        this.serviceOrderReportEndTime = serviceOrderReportEndTime;
    }

    public Date getServiceOrderFinishStartTime() {
        return serviceOrderFinishStartTime;
    }

    public void setServiceOrderFinishStartTime(Date serviceOrderFinishStartTime) {
        this.serviceOrderFinishStartTime = serviceOrderFinishStartTime;
    }

    public Date getServiceOrderFinishEndTime() {
        return serviceOrderFinishEndTime;
    }

    public void setServiceOrderFinishEndTime(Date serviceOrderFinishEndTime) {
        this.serviceOrderFinishEndTime = serviceOrderFinishEndTime;
    }

    public Boolean getAffirmSearchCustomer() {
        return affirmSearchCustomer;
    }

    public void setAffirmSearchCustomer(Boolean affirmSearchCustomer) {
        this.affirmSearchCustomer = affirmSearchCustomer;
    }

    public Boolean getSettlementSearch() {
        return settlementSearch;
    }

    public void setSettlementSearch(Boolean settlementSearch) {
        this.settlementSearch = settlementSearch;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    public Boolean getConfirmSingle() {
        return confirmSingle;
    }

    public void setConfirmSingle(Boolean confirmSingle) {
        this.confirmSingle = confirmSingle;
    }

    public Boolean getUniExport() {
        return uniExport;
    }

    public void setUniExport(Boolean uniExport) {
        this.uniExport = uniExport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public Boolean getNotMergeShop() {
        return notMergeShop;
    }

    public void setNotMergeShop(Boolean notMergeShop) {
        this.notMergeShop = notMergeShop;
    }

    public List<Long> getQuotationOrderIds() {
        return quotationOrderIds;
    }

    public void setQuotationOrderIds(List<Long> quotationOrderIds) {
        this.quotationOrderIds = quotationOrderIds;
    }

    public Boolean getNotTimely() {
        return notTimely;
    }

    public void setNotTimely(Boolean notTimely) {
        this.notTimely = notTimely;
    }

    public String getUserMemberType() {
        return userMemberType;
    }

    public void setUserMemberType(String userMemberType) {
        this.userMemberType = userMemberType;
    }

    public Boolean getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Boolean timeOut) {
        this.timeOut = timeOut;
    }

    public Boolean getQureyPretrialTime() {
        return qureyPretrialTime;
    }

    public void setQureyPretrialTime(Boolean qureyPretrialTime) {
        this.qureyPretrialTime = qureyPretrialTime;
    }

    public List<String> getUnQuotationStatus() {
        return unQuotationStatus;
    }

    public void setUnQuotationStatus(List<String> unQuotationStatus) {
        this.unQuotationStatus = unQuotationStatus;
    }

    public Boolean getCostUpload() {
        return costUpload;
    }

    public void setCostUpload(Boolean costUpload) {
        this.costUpload = costUpload;
    }

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuotationOrderSearchPageCondition that = (QuotationOrderSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(shopCodes, that.shopCodes) &&
                Objects.equals(customerShopCode, that.customerShopCode) &&
                Objects.equals(quotationOrderId, that.quotationOrderId) &&
                Objects.equals(mergeQuotationOrderId, that.mergeQuotationOrderId) &&
                Objects.equals(quotationOrderNo, that.quotationOrderNo) &&
                Objects.equals(workOrderNo, that.workOrderNo) &&
                Objects.equals(serviceOrderNo, that.serviceOrderNo) &&
                Objects.equals(serviceOrderStatus, that.serviceOrderStatus) &&
                Objects.equals(unServiceOrderStatus, that.unServiceOrderStatus) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(submitTime, that.submitTime) &&
                Objects.equals(producer, that.producer) &&
                Objects.equals(updater, that.updater) &&
                Objects.equals(hidecancel, that.hidecancel) &&
                Objects.equals(merge, that.merge) &&
                Objects.equals(cusmerge, that.cusmerge) &&
                Objects.equals(isBlankServiceOrderId, that.isBlankServiceOrderId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(companyIds, that.companyIds) &&
                Objects.equals(companyBrandId, that.companyBrandId) &&
                Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(doOrUse, that.doOrUse) &&
                Objects.equals(confirmSingle, that.confirmSingle) &&
                Objects.equals(region, that.region) &&
                Objects.equals(stateId, that.stateId) &&
                Objects.equals(cityId, that.cityId) &&
                Objects.equals(districtId, that.districtId) &&
                Objects.equals(quotationStatus, that.quotationStatus) &&
                Objects.equals(unQuotationStatus, that.unQuotationStatus) &&
                Objects.equals(settlementStatus, that.settlementStatus) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(reviewStartTime, that.reviewStartTime) &&
                Objects.equals(reviewEndTime, that.reviewEndTime) &&
                Objects.equals(createStartTime, that.createStartTime) &&
                Objects.equals(createEndTime, that.createEndTime) &&
                Objects.equals(serviceOrderReportStartTime, that.serviceOrderReportStartTime) &&
                Objects.equals(serviceOrderReportEndTime, that.serviceOrderReportEndTime) &&
                Objects.equals(serviceOrderFinishStartTime, that.serviceOrderFinishStartTime) &&
                Objects.equals(serviceOrderFinishEndTime, that.serviceOrderFinishEndTime) &&
                Objects.equals(affirmSearchCustomer, that.affirmSearchCustomer) &&
                Objects.equals(settlementSearch, that.settlementSearch) &&
                memberType == that.memberType &&
                Objects.equals(uniExport, that.uniExport) &&
                Objects.equals(type, that.type) &&
                Objects.equals(dateType, that.dateType) &&
                Objects.equals(notMergeShop, that.notMergeShop) &&
                Objects.equals(notTimely, that.notTimely) &&
                Objects.equals(quotationOrderIds, that.quotationOrderIds) &&
                Objects.equals(urgencyTypes, that.urgencyTypes) &&
                Objects.equals(userMemberType, that.userMemberType) &&
                Objects.equals(mergeQuotationOrderIdNull, that.mergeQuotationOrderIdNull) &&
                Objects.equals(mergeQuotationOrderNoNull, that.mergeQuotationOrderNoNull) &&
                Objects.equals(merged, that.merged) &&
                Objects.equals(timeOut, that.timeOut) &&
                Objects.equals(qureyPretrialTime, that.qureyPretrialTime) &&
                Objects.equals(costUpload, that.costUpload) &&
                Objects.equals(callNo, that.callNo) &&
                Objects.equals(searchType, that.searchType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orgTreeIds, shopCodes, customerShopCode, quotationOrderId, mergeQuotationOrderId, quotationOrderNo, workOrderNo, serviceOrderNo, serviceOrderStatus, unServiceOrderStatus, createTime, endTime, submitTime, producer, updater, hidecancel, merge, cusmerge, isBlankServiceOrderId, companyId, companyIds, companyBrandId, shopCode, doOrUse, confirmSingle, region, stateId, cityId, districtId, quotationStatus, unQuotationStatus, settlementStatus, shopAuths, reviewStartTime, reviewEndTime, createStartTime, createEndTime, serviceOrderReportStartTime, serviceOrderReportEndTime, serviceOrderFinishStartTime, serviceOrderFinishEndTime, affirmSearchCustomer, settlementSearch, memberType, uniExport, type, dateType, notMergeShop, notTimely, quotationOrderIds, urgencyTypes, userMemberType, mergeQuotationOrderIdNull, mergeQuotationOrderNoNull, merged, timeOut, qureyPretrialTime, costUpload, callNo, searchType);
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public List<ServiceType> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<ServiceType> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }
}
