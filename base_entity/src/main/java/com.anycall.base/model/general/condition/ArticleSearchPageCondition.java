package com.anycall.base.model.general.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by Auser on 2016/8/19.
 */
public class ArticleSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = 2992835877216790955L;
    private String orgType;
    private String type;

    private Boolean isPublish;

    private Long catId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArticleSearchPageCondition that = (ArticleSearchPageCondition) o;
        return Objects.equals(catId, that.catId) &&
                Objects.equals(isPublish, that.isPublish)&&
                Objects.equals(orgType, that.orgType)&&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catId, isPublish,orgType,type);
    }
}
