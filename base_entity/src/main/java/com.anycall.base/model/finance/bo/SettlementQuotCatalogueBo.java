package com.anycall.base.model.finance.bo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.finance.SettlementQuotation;

import java.util.List;

/**
 * Created by Amy on 2017/3/15.
 */
public class SettlementQuotCatalogueBo extends SettlementQuotation {
    private static final long serialVersionUID = 475837610865844132L;

    private String companyName;

    private String orgName;

    private String regionName;

    //导出excel时，目录页的结算报价金额总额
    private Double excelSettlementPriceTotal;

    private List<SettlementQuotationLineBo> shopLineBos;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public List<SettlementQuotationLineBo> getShopLineBos() {
        return shopLineBos;
    }

    public void setShopLineBos(List<SettlementQuotationLineBo> shopLineBos) {
        this.shopLineBos = shopLineBos;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Double getExcelSettlementPriceTotal() {
        return excelSettlementPriceTotal;
    }

    public void setExcelSettlementPriceTotal(Double excelSettlementPriceTotal) {
        this.excelSettlementPriceTotal = excelSettlementPriceTotal;
    }
}
