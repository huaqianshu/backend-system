package com.anycall.base.model.goods.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class BrandSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -4883644812624026818L;

    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BrandSearchPageCondition that = (BrandSearchPageCondition) o;
        return Objects.equals(enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enabled);
    }
}
