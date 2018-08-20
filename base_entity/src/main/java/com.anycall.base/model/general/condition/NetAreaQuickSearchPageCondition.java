package com.anycall.base.model.general.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class NetAreaQuickSearchPageCondition extends QuickSearchPageCondition {
    private static final long serialVersionUID = 663578778135227253L;

    private Long orgId;
    private Long currentNetArea;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCurrentNetArea() {
        return currentNetArea;
    }

    public void setCurrentNetArea(Long currentNetArea) {
        this.currentNetArea = currentNetArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NetAreaQuickSearchPageCondition that = (NetAreaQuickSearchPageCondition) o;
        return Objects.equals(orgId, that.orgId) &&
                Objects.equals(currentNetArea, that.currentNetArea) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orgId, currentNetArea, id);
    }
}
