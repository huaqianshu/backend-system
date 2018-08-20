package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;

public class MemberCount extends AbstractPersistable {
    private String cityCode;
    private String city;
    private int count;
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
