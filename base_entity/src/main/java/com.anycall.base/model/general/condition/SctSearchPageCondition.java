package com.anycall.base.model.general.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class SctSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = 1269307258740428053L;
    private Long catalogTemplateId;

    public Long getCatalogTemplateId() {
        return catalogTemplateId;
    }

    public void setCatalogTemplateId(Long catalogTemplateId) {
        this.catalogTemplateId = catalogTemplateId;
    }


    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        SctSearchPageCondition that = (SctSearchPageCondition) o;
//        return Objects.equals(orgType, that.orgType) &&
//                Objects.equals(approvalStatus, that.approvalStatus);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), orgType, approvalStatus);
//    }
}
