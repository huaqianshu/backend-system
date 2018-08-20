package com.anycall.base.model.goods.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class ItemSearchPageCondition extends QuickSearchOrgPageCondition {

    //新类需要重新生成
    private static final long serialVersionUID = -2890941159673997332L;

    private String catPath;

    private Long brandId;

    private List<Long> orgTreeIds;

    public String getCatPath() {
        return catPath;
    }

    public void setCatPath(String catPath) {
        this.catPath = catPath;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
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
        ItemSearchPageCondition that = (ItemSearchPageCondition) o;
        return Objects.equals(catPath, that.catPath) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(orgTreeIds, that.orgTreeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catPath, brandId, orgTreeIds);
    }
}
