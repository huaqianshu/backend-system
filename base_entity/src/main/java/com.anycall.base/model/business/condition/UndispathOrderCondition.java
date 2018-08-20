package com.anycall.base.model.business.condition;

import com.anycall.base.common.PageCondition;
import com.anycall.base.model.business.WorkOrderStatus;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class UndispathOrderCondition extends PageCondition {

    private static final long serialVersionUID = -6178265456024757099L;

    private List<Long> orgTreeIds;

    private String sortProperty;

    private String sortDirection;

    private String searchText;

    private Long companyBrandId;

    private String netAreaIds;

    private String shopCode;

    private Date searchDate;

    private Boolean isUrgent;

    private Boolean isRefix;

    private String type;

    private Long dispatcherId;

    private String shopAuths;

    private String workOrderNo;

    private List<Long> workOrderIds;
    private List<WorkOrderStatus> statuses;
    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public List<WorkOrderStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<WorkOrderStatus> statuses) {
        this.statuses = statuses;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public List<Long> getWorkOrderIds() {
        return workOrderIds;
    }

    public void setWorkOrderIds(List<Long> workOrderIds) {
        this.workOrderIds = workOrderIds;
    }

    @Override
    public String getSortProperty() {
        return sortProperty;
    }

    @Override
    public void setSortProperty(String sortProperty) {
        this.sortProperty = sortProperty;
    }

    @Override
    public String getSortDirection() {
        return sortDirection;
    }

    @Override
    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public Long getCompanyBrandId() {
        return companyBrandId;
    }

    public void setCompanyBrandId(Long companyBrandId) {
        this.companyBrandId = companyBrandId;
    }

    public String getNetAreaIds() {
        return netAreaIds;
    }

    public void setNetAreaIds(String netAreaIds) {
        this.netAreaIds = netAreaIds;
    }

    public Boolean getUrgent() {
        return isUrgent;
    }

    public void setUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Boolean getRefix() {
        return isRefix;
    }

    public void setRefix(Boolean refix) {
        isRefix = refix;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    public Boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Boolean getIsRefix() {
        return isRefix;
    }

    public void setIsRefix(Boolean refix) {
        isRefix = refix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UndispathOrderCondition that = (UndispathOrderCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(sortProperty, that.sortProperty) &&
                Objects.equals(sortDirection, that.sortDirection) &&
                Objects.equals(searchText, that.searchText) &&
                Objects.equals(companyBrandId, that.companyBrandId) &&
                Objects.equals(netAreaIds, that.netAreaIds) &&
                Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(searchDate, that.searchDate) &&
                Objects.equals(isUrgent, that.isUrgent) &&
                Objects.equals(isRefix, that.isRefix) &&
                Objects.equals(type, that.type) &&
                Objects.equals(dispatcherId, that.dispatcherId) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(workOrderNo, that.workOrderNo) &&
                Objects.equals(workOrderIds, that.workOrderIds);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orgTreeIds, sortProperty, sortDirection, searchText, companyBrandId, netAreaIds, shopCode, searchDate, isUrgent, isRefix, type, dispatcherId, shopAuths, workOrderNo, workOrderIds);
    }
}
