package com.anycall.base.model.goods.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;


/**
 * Created by yubotao on 16/8/22.
 */
public class SkuSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -5548638895377858215L;

    private String searchKey;

    private String catPath;

    private Boolean enabled;

    private List<Long> orgTreeIds;

    private List<String> skuCodes;

    private Boolean queryAllSku;

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getCatPath() {
        return catPath;
    }

    public void setCatPath(String catPath) {
        this.catPath = catPath;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public List<String> getSkuCodes() {
        return skuCodes;
    }

    public void setSkuCodes(List<String> skuCodes) {
        this.skuCodes = skuCodes;
    }

    public Boolean getQueryAllSku() {
        return queryAllSku;
    }

    public void setQueryAllSku(Boolean queryAllSku) {
        this.queryAllSku = queryAllSku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SkuSearchPageCondition that = (SkuSearchPageCondition) o;
        return Objects.equals(searchKey, that.searchKey) &&
                Objects.equals(catPath, that.catPath) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(skuCodes, that.skuCodes) &&
                Objects.equals(queryAllSku, that.queryAllSku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), searchKey, catPath, enabled, orgTreeIds, skuCodes, queryAllSku);
    }
}
