package com.anycall.base.model.finance.vo;


import com.anycall.base.model.finance.SettlementReceipt;


public class SettlementReceiptVo extends SettlementReceipt {

    private static final long serialVersionUID = -5247240681300584265L;

    private Long shopsOrQuotationsQuantity;

    private String orgName;

    private String companyName;

    private String brandName;

    private String exportStatus;

    private String exportType;

    private String exportHolding;

    private String exportShopQuantity;

    private String exportQuotationOrderQuantity;

    public Long getShopsOrQuotationsQuantity() {
        return shopsOrQuotationsQuantity;
    }

    public void setShopsOrQuotationsQuantity(Long shopsOrQuotationsQuantity) {
        this.shopsOrQuotationsQuantity = shopsOrQuotationsQuantity;
    }

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

    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public String getExportHolding() {
        return exportHolding;
    }

    public void setExportHolding(String exportHolding) {
        this.exportHolding = exportHolding;
    }

    public String getExportShopQuantity() {
        return exportShopQuantity;
    }

    public void setExportShopQuantity(String exportShopQuantity) {
        this.exportShopQuantity = exportShopQuantity;
    }

    public String getExportQuotationOrderQuantity() {
        return exportQuotationOrderQuantity;
    }

    public void setExportQuotationOrderQuantity(String exportQuotationOrderQuantity) {
        this.exportQuotationOrderQuantity = exportQuotationOrderQuantity;
    }
}
