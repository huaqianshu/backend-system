package com.anycall.base.model.business.bo;


import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2016/7/29.
 */
public class SelectOrgTopBo implements Serializable {

    private static final long serialVersionUID = 13595824467161723L;

    private Long orgId;
    private String orgName;

    private BigDecimal score;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public BigDecimal getScore() {
        return score.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
