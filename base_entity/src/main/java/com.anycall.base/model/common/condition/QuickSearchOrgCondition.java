package com.anycall.base.model.common.condition;

import com.anycall.base.common.BaseCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class QuickSearchOrgCondition implements BaseCondition {

    private static final long serialVersionUID = -4010482156150455562L;
    
    private Long orgId;

    private String searchText;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    //使用idea自动生成equals和hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuickSearchOrgCondition that = (QuickSearchOrgCondition) o;
        return Objects.equals(orgId, that.orgId) &&
                Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgId, searchText);
    }
}
