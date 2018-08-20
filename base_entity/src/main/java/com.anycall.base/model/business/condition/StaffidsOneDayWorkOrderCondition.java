package com.anycall.base.model.business.condition;

import com.anycall.base.common.BaseCondition;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class StaffidsOneDayWorkOrderCondition implements BaseCondition {

    private static final long serialVersionUID = 2588785252293369381L;
    //日期
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;
    //日期
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    private List<Long> orgIds;

    private String shopAuths;
    private List<Long> staffIds;

    public List<Long> getStaffIds() {
        return staffIds;
    }

    public void setStaffIds(List<Long> staffIds) {
        this.staffIds = staffIds;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Long> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<Long> orgIds) {
        this.orgIds = orgIds;
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
        StaffidsOneDayWorkOrderCondition that = (StaffidsOneDayWorkOrderCondition) o;
        return Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(orgIds, that.orgIds) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(staffIds, that.staffIds);
    }

    @Override
    public int hashCode() {

        return Objects.hash(startDate, endDate, orgIds, shopAuths, staffIds);
    }
}
