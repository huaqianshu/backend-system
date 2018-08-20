package com.anycall.base.model.business.condition;

import com.anycall.base.model.business.ServiceOrderStatus;
import com.anycall.base.model.business.SortListStatus;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by hachi on 2016/10/13.
 */
public class SortListSearchPageCondition extends QuickSearchOrgPageCondition {
    private static final long serialVersionUID = -6380882832988712599L;

    private String shopCode;

    private List<SortListStatus> statuses;

    private List<SortListStatus> unstatuses;

    private List<ServiceOrderStatus> serviceOrderStatuses;

    private Date startTime;

    private Date endTime;

    private Date reportStartTime;

    private Date reportEndTime;

    private Long brandId;

    public Date getReportStartTime() {
        return reportStartTime;
    }

    public void setReportStartTime(Date reportStartTime) {
        this.reportStartTime = reportStartTime;
    }

    public Date getReportEndTime() {
        return reportEndTime;
    }

    public void setReportEndTime(Date reportEndTime) {
        this.reportEndTime = reportEndTime;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public List<SortListStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<SortListStatus> statuses) {
        this.statuses = statuses;
    }

    public List<ServiceOrderStatus> getServiceOrderStatuses() {
        return serviceOrderStatuses;
    }

    public void setServiceOrderStatuses(List<ServiceOrderStatus> serviceOrderStatuses) {
        this.serviceOrderStatuses = serviceOrderStatuses;
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

    public List<SortListStatus> getUnstatuses() {
        return unstatuses;
    }

    public void setUnstatuses(List<SortListStatus> unstatuses) {
        this.unstatuses = unstatuses;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SortListSearchPageCondition that = (SortListSearchPageCondition) o;
        return Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(unstatuses, that.unstatuses) &&
                Objects.equals(serviceOrderStatuses, that.serviceOrderStatuses) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(reportStartTime, that.reportStartTime) &&
                Objects.equals(reportEndTime, that.reportEndTime) &&
                Objects.equals(brandId, that.brandId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shopCode, statuses, unstatuses, serviceOrderStatuses, startTime, endTime, reportStartTime, reportEndTime, brandId);
    }
}
