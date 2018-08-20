package com.anycall.base.model.finance.bo;

import com.anycall.base.model.finance.vo.SettlementVo;

/**
 * Created by zheng on 2016/9/26.
 */
public class SettlementBo extends SettlementVo {
    private static final long serialVersionUID = -4278468305075104803L;
    private String orgName;
    private String companyName;
    private String brandName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
