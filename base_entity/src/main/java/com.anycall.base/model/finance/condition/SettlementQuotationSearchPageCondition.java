package com.anycall.base.model.finance.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SettlementQuotationSearchPageCondition extends QuickSearchOrgPageCondition {
    private static final long serialVersionUID = 6171369245707046387L;

    private Long id;
    private Integer year;
    private Integer month;

    private Long companyId;

    private String status;
    //不显示什么状态
    private String unStatus;

    private String type;

    private List<String> shopCodes;

    private Long approver;

    private String shopAuths;

    private String settlementNo;

    private Long brandId;

    private Date startCreateTime;

    private Date endCreateTime;

    private List<String> types;

    private List<String> statuses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUnStatus() {
        return unStatus;
    }

    public void setUnStatus(String unStatus) {
        this.unStatus = unStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getShopCodes() {
        return shopCodes;
    }

    public void setShopCodes(List<String> shopCodes) {
        this.shopCodes = shopCodes;
    }

    public Long getApprover() {
        return approver;
    }

    public void setApprover(Long approver) {
        this.approver = approver;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
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

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettlementQuotationSearchPageCondition that = (SettlementQuotationSearchPageCondition) o;
        return Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(unStatus, that.unStatus) &&
                Objects.equals(type, that.type) &&
                Objects.equals(shopCodes, that.shopCodes) &&
                Objects.equals(approver, that.approver) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(settlementNo, that.settlementNo) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(startCreateTime, that.startCreateTime) &&
                Objects.equals(endCreateTime, that.endCreateTime) &&
                Objects.equals(types, that.types) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year, month, companyId, status, unStatus, type, shopCodes, approver, shopAuths, settlementNo, brandId, startCreateTime, endCreateTime, types, statuses, id);
    }
}
