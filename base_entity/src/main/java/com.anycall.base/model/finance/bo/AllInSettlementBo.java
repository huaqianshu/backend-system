package com.anycall.base.model.finance.bo;

import com.anycall.base.model.finance.vo.AllInSettlementVo;
/**
 * Created by Auser on 2016/9/26.
 */
public class AllInSettlementBo extends AllInSettlementVo {
    private static final long serialVersionUID = -1231642217428151297L;
    private String orgName;
    private String companyName;
    private String contractName;
    private String shopName;
    private Integer allInSettlementDay;

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

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getAllInSettlementDay() {
        return allInSettlementDay;
    }

    public void setAllInSettlementDay(Integer allInSettlementDay) {
        this.allInSettlementDay = allInSettlementDay;
    }
}
