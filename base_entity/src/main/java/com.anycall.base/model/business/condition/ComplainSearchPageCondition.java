package com.anycall.base.model.business.condition;
import com.anycall.base.model.business.ComplainStatus;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ComplainSearchPageCondition extends QuickSearchOrgPageCondition {


    private static final long serialVersionUID = 3174498679270172600L;

    private Long companyId;

    private String region;

    private String shopCode;

    private String serviceOrderNo;

    private String complainMan;

    private Date startTime;

    private Date endTime;

    private String status;

    private Long supplierId;

    private List<ComplainStatus> statuses;

    private String shopAuths;

    private List<String> customerShopCodes;

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
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

    public List<ComplainStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<ComplainStatus> statuses) {
        this.statuses = statuses;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
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

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getComplainMan() {
        return complainMan;
    }

    public void setComplainMan(String complainMan) {
        this.complainMan = complainMan;
    }

    public List<String> getCustomerShopCodes() {
        return customerShopCodes;
    }

    public void setCustomerShopCodes(List<String> customerShopCodes) {
        this.customerShopCodes = customerShopCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComplainSearchPageCondition that = (ComplainSearchPageCondition) o;
        return Objects.equals(companyId, that.companyId) &&
                Objects.equals(region, that.region) &&
                Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(serviceOrderNo, that.serviceOrderNo) &&
                Objects.equals(complainMan, that.complainMan) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(customerShopCodes, that.customerShopCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyId, region, shopCode, serviceOrderNo, complainMan, startTime, endTime, status, supplierId, statuses, shopAuths, customerShopCodes);
    }
}
