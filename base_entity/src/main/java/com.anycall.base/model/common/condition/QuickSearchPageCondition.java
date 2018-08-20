package com.anycall.base.model.common.condition;

import com.anycall.base.common.PageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class QuickSearchPageCondition extends PageCondition {

    private static final long serialVersionUID = 4446133615713889545L;

    private String searchText;

    private List<Long> orgTreeIds;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuickSearchPageCondition that = (QuickSearchPageCondition) o;
        return Objects.equals(searchText, that.searchText)&&
                Objects.equals(orgTreeIds, that.orgTreeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), searchText, orgTreeIds);
    }
}
