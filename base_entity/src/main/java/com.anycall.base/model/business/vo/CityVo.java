package com.anycall.base.model.business.vo;

import java.util.List;
import java.util.Objects;

public class CityVo {

    private Long cityId;
    private String cityName;

    private List<DistrictVo> districtVoList;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<DistrictVo> getDistrictVoList() {
        return districtVoList;
    }

    public void setDistrictVoList(List<DistrictVo> districtVoList) {
        this.districtVoList = districtVoList;
    }
}
