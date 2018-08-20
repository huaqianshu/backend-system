package com.anycall.base.model.business.bo;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2016/7/29.
 */
public class SelectWorkerCommonBo implements Serializable {

    private static final long serialVersionUID = 13595820667161723L;

    private Long workerId;
    private String workerName;
    private BigDecimal score;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
