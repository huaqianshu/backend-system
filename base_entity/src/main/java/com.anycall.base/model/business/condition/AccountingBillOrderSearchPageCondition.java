package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AccountingBillOrderSearchPageCondition extends QuickSearchOrgPageCondition {

    private List<Long> orgTreeIds;

    private String customerShopCode;

    private String shopAuths;

    //服务商
    private Long orgId;

    //公司
    private Long companyId;

    private Integer year;
    private Integer month;

    //状态
    private String accountingBillStatus;

    //创建时间
    private Date createTime;

    //结束时间
    private Date endTime;

    @Override
    public Long getOrgId() {
        return orgId;
    }

    @Override
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAccountingBillStatus() {
        return accountingBillStatus;
    }

    public void setAccountingBillStatus(String accountingBillStatus) {
        this.accountingBillStatus = accountingBillStatus;
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

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AccountingBillOrderSearchPageCondition that = (AccountingBillOrderSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(customerShopCode, that.customerShopCode) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(accountingBillStatus, that.accountingBillStatus) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds, customerShopCode, shopAuths, orgId, companyId, year, month, accountingBillStatus, createTime, endTime);
    }
}
