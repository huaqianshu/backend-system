package com.anycall.base.model.finance.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.Objects;

public class SettlementMonthLineSearchPageCondition extends QuickSearchOrgPageCondition {

    private Integer year;

    private Integer month;

    private Long companyId;

    private String serCreateDate;

    private String endCreateDate;

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

    public String getSerCreateDate() {
        return serCreateDate;
    }

    public void setSerCreateDate(String serCreateDate) {
        this.serCreateDate = serCreateDate;
    }

    public String getEndCreateDate() {
        return endCreateDate;
    }

    public void setEndCreateDate(String endCreateDate) {
        this.endCreateDate = endCreateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettlementMonthLineSearchPageCondition that = (SettlementMonthLineSearchPageCondition) o;
        return Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(serCreateDate, that.serCreateDate) &&
                Objects.equals(endCreateDate, that.endCreateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year, month, companyId, serCreateDate, endCreateDate);
    }
}
