package com.anycall.base.model.business.condition;

import com.anycall.base.common.BaseCondition;

import java.util.Objects;

public class PayeeCondition implements BaseCondition {

    private static final long serialVersionUID = 2588585212293369381L;
    private String stateName;
    private String cityName;
    private String searchText;
    private String payeeName;
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
        PayeeCondition that = (PayeeCondition) o;
        return Objects.equals(stateName, that.stateName) &&
                Objects.equals(cityName, that.cityName) &&
                Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stateName, cityName, searchText);
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
}
