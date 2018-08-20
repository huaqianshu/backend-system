package com.anycall.base.model.common.condition;

import com.anycall.base.common.PageCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class QuickSearchOrgPageCondition extends PageCondition {

    private static final long serialVersionUID = -2692315676840396006L;

    private Long orgId;

    private String searchText;
    private Boolean searchAll=false;//是否查询所有 默认不查

    public Boolean getSearchAll() {
        return searchAll;
    }

    public void setSearchAll(Boolean searchAll) {
        this.searchAll = searchAll;
    }

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
        QuickSearchOrgPageCondition that = (QuickSearchOrgPageCondition) o;
        return Objects.equals(orgId, that.orgId) &&
                Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgId, searchText);
    }
}
