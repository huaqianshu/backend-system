package com.anycall.base.model.common.condition;

import com.anycall.base.common.BaseCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class QuickSearchCondition implements BaseCondition {

    private static final long serialVersionUID = -7063839213310612128L;

    private String searchText;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuickSearchCondition that = (QuickSearchCondition) o;
        return Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchText);
    }
}
