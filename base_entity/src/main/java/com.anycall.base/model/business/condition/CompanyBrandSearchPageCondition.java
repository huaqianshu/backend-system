package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class CompanyBrandSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -4883644812624026818L;

    private Boolean enabled;
    private String brandName;
    private List<Long> brandIds;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Long> getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(List<Long> brandIds) {
        this.brandIds = brandIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CompanyBrandSearchPageCondition that = (CompanyBrandSearchPageCondition) o;
        return Objects.equals(enabled, that.enabled) &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(brandIds, that.brandIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enabled, brandName, brandIds);
    }
}
