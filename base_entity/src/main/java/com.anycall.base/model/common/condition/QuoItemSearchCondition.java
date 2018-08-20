package com.anycall.base.model.common.condition;

import com.anycall.base.common.BaseCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class QuoItemSearchCondition implements BaseCondition {

    private static final long serialVersionUID = -7063839213310612128L;

    private Long contractId;

    private List<String> skuCode;

    private String searchText;

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public List<String> getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(List<String> skuCode) {
        this.skuCode = skuCode;
    }

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
        QuoItemSearchCondition that = (QuoItemSearchCondition) o;
        return Objects.equals(contractId, that.contractId) &&
                Objects.equals(skuCode, that.skuCode) &&
                Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractId, skuCode, searchText);
    }
}
