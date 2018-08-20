package com.anycall.base.model.common.bo;

import java.io.Serializable;

/**
 * Created by Robin on 16/10/13.
 */
public class WorkOrderRateTemplate implements Serializable {
    private static final long serialVersionUID = 3882755899224389333L;
    private String type;//类型有两种（到场和按时到场）
    private Long arriveRate;
    private Long lateRate;
    private Long unArriveRate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getArriveRate() {
        return arriveRate;
    }

    public void setArriveRate(Long arriveRate) {
        this.arriveRate = arriveRate;
    }

    public Long getLateRate() {
        return lateRate;
    }

    public void setLateRate(Long lateRate) {
        this.lateRate = lateRate;
    }

    public Long getUnArriveRate() {
        return unArriveRate;
    }

    public void setUnArriveRate(Long unArriveRate) {
        this.unArriveRate = unArriveRate;
    }
}
