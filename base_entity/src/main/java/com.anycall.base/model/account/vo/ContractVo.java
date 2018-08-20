package com.anycall.base.model.account.vo;

import com.anycall.base.model.account.*;

import java.util.List;
public class ContractVo extends Contract {
    private static final long serialVersionUID = 2702099188190357486L;
    private List<ContractProject> contractProjects;
    private List<ContractQuotation> contractQuotations;
    private List<ContractServiceCatalog> contractServiceCatalogs;
    private List<ContractServiceCatalogVo> contractServiceCatalogsForPlatForm;
    private List<ContractShop> contractShops;
    //用于前台显示重复的合约目录添加
    private List<ContractServiceCatalog>contractServiceCatalogsExist;

    public List<ContractServiceCatalog> getContractServiceCatalogsExist() {
        return contractServiceCatalogsExist;
    }

    public void setContractServiceCatalogsExist(List<ContractServiceCatalog> contractServiceCatalogsExist) {
        this.contractServiceCatalogsExist = contractServiceCatalogsExist;
    }

    public List<ContractServiceCatalogVo> getContractServiceCatalogsForPlatForm() {
        return contractServiceCatalogsForPlatForm;
    }

    public void setContractServiceCatalogsForPlatForm(List<ContractServiceCatalogVo> contractServiceCatalogsForPlatForm) {
        this.contractServiceCatalogsForPlatForm = contractServiceCatalogsForPlatForm;
    }

    public List<ContractQuotation> getContractQuotations() {
        return contractQuotations;
    }

    public void setContractQuotations(List<ContractQuotation> contractQuotations) {
        this.contractQuotations = contractQuotations;
    }

    public List<ContractServiceCatalog> getContractServiceCatalogs() {
        return contractServiceCatalogs;
    }

    public void setContractServiceCatalogs(List<ContractServiceCatalog> contractServiceCatalogs) {
        this.contractServiceCatalogs = contractServiceCatalogs;
    }

    public List<ContractShop> getContractShops() {
        return contractShops;
    }

    public void setContractShops(List<ContractShop> contractShops) {
        this.contractShops = contractShops;
    }

    public List<ContractProject> getContractProjects() {
        return contractProjects;
    }

    public void setContractProjects(List<ContractProject> contractProjects) {
        this.contractProjects = contractProjects;
    }
}
