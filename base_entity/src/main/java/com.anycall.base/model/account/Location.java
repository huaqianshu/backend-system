package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;

public class Location extends AbstractPersistable {

    private Double lat;
    private Double lon;
    private Long memberId;
    private Long cityId;
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

}
