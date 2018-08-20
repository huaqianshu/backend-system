package com.anycall.base.model.business.vo;

import java.util.List;
import java.util.Objects;

public class ProvinceVo {

    private Long proviceId;
    private String proviceName;

    List<CityVo> cityVoList;

    public Long getProviceId() {
        return proviceId;
    }

    public void setProviceId(Long proviceId) {
        this.proviceId = proviceId;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public List<CityVo> getCityVoList() {
        return cityVoList;
    }

    public void setCityVoList(List<CityVo> cityVoList) {
        this.cityVoList = cityVoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvinceVo that = (ProvinceVo) o;
        return Objects.equals(proviceId, that.proviceId) &&
                Objects.equals(proviceName, that.proviceName) &&
                Objects.equals(cityVoList, that.cityVoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(proviceId, proviceName, cityVoList);
    }
}
