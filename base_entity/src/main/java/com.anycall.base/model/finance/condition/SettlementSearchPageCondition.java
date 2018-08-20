package com.anycall.base.model.finance.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;
import com.anycall.base.model.finance.SettlementStatus;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.jar.Pack200;

public class SettlementSearchPageCondition extends QuickSearchOrgPageCondition {
    private static final long serialVersionUID = 6171369245707046387L;

    private Integer year;
    private Integer month;

    private Long companyId;

    private List<String> companyIds;

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

    private Long foreignKey;

    private String lineSearchText;

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

    public List<String> getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(List<String> companyIds) {
        this.companyIds = companyIds;
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

    public Long getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(Long foreignKey) {
        this.foreignKey = foreignKey;
    }

    public String getLineSearchText() {
        return lineSearchText;
    }

    public void setLineSearchText(String lineSearchText) {
        this.lineSearchText = lineSearchText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettlementSearchPageCondition that = (SettlementSearchPageCondition) o;
        return Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(companyIds, that.companyIds) &&
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
                Objects.equals(foreignKey, that.foreignKey) &&
                Objects.equals(lineSearchText, that.lineSearchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year, month, companyId, companyIds, status, unStatus, type, shopCodes, approver, shopAuths, settlementNo, brandId, startCreateTime, endCreateTime, types, statuses, foreignKey, lineSearchText);
    }
}
