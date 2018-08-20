package com.anycall.base.model.account.bo;

import com.anycall.base.model.account.vo.ContractVo;
public class ContractBo extends ContractVo {
    private static final long serialVersionUID = 4826085983892272913L;
    private String supplierOrgName;
    private String companyName;
    private String companyBrandName;
    private String rootOrgName;

    public String getSupplierOrgName() {
        return supplierOrgName;
    }

    public void setSupplierOrgName(String supplierOrgName) {
        this.supplierOrgName = supplierOrgName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBrandName() {
        return companyBrandName;
    }

    public void setCompanyBrandName(String companyBrandName) {
        this.companyBrandName = companyBrandName;
    }

    public String getRootOrgName() {
        return rootOrgName;
    }

    public void setRootOrgName(String rootOrgName) {
        this.rootOrgName = rootOrgName;
    }
}
