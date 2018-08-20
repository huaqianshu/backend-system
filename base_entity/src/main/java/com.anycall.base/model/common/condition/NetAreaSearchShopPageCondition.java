package com.anycall.base.model.common.condition;

import com.anycall.base.common.PageCondition;

import java.util.Objects;

/**
 * Created by admin on 2016/8/18.
 */
public class NetAreaSearchShopPageCondition extends PageCondition {

    private static final long serialVersionUID = 485628643517842280L;

    private Long shopId;

    private String searchText;
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
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
        NetAreaSearchShopPageCondition that = (NetAreaSearchShopPageCondition) o;
        return Objects.equals(shopId, that.shopId) &&
                Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shopId, searchText);
    }
}
