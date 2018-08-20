package com.anycall.base.model.general.condition;

import com.anycall.base.model.business.ServiceOrderType;
import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.List;
import java.util.Objects;


public class ServiceCatalogSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = 5103342677510467876L;
    private  Integer level;

    private  Long parentId;

    //（优衣库）配置类型
    private ServiceOrderType configurationType;
    private String catalogLevelTwoName;
    private String shopCodeForAnyCall;

    //takeEffect
    private Boolean takeEffect;

    //ids
    private List<Long> parentIds;

    public String getCatalogLevelTwoName() {
        return catalogLevelTwoName;
    }

    public void setCatalogLevelTwoName(String catalogLevelTwoName) {
        this.catalogLevelTwoName = catalogLevelTwoName;
    }

    public List<Long> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<Long> parentIds) {
        this.parentIds = parentIds;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }


    public Boolean getTakeEffect() {
        return takeEffect;
    }

    public void setTakeEffect(Boolean takeEffect) {
        this.takeEffect = takeEffect;
    }

    public ServiceOrderType getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(ServiceOrderType configurationType) {
        this.configurationType = configurationType;
    }

    public String getShopCodeForAnyCall() {
        return shopCodeForAnyCall;
    }

    public void setShopCodeForAnyCall(String shopCodeForAnyCall) {
        this.shopCodeForAnyCall = shopCodeForAnyCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceCatalogSearchPageCondition that = (ServiceCatalogSearchPageCondition) o;
        return Objects.equals(level, that.level) &&
                Objects.equals(parentId, that.parentId) &&
                configurationType == that.configurationType &&
                Objects.equals(catalogLevelTwoName, that.catalogLevelTwoName) &&
                Objects.equals(shopCodeForAnyCall, that.shopCodeForAnyCall) &&
                Objects.equals(takeEffect, that.takeEffect) &&
                Objects.equals(parentIds, that.parentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), level, parentId, configurationType, catalogLevelTwoName, shopCodeForAnyCall, takeEffect, parentIds);
    }
}
