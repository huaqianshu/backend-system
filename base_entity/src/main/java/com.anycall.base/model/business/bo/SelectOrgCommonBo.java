package com.anycall.base.model.business.bo;


import com.anycall.base.model.account.vo.OrganizationVo;

import java.io.Serializable;

/**
 * Created by admin on 2016/7/29.
 */
public class SelectOrgCommonBo extends OrganizationVo implements Serializable {

    private static final long serialVersionUID = 13599833367161723L;

    private Long orgId;
    private String orgName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
