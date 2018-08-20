package com.anycall.base.model.account.bo;

import com.anycall.base.model.account.ContractShop;

public class ContractShopBo extends ContractShop {
    private static final long serialVersionUID = -5874076829069316683L;
    //excel表格的行
    private Long excelNum;
    //错误信息
    private String errorMessage;
    //服务对象
    private Long companyId;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getExcelNum() {
        return excelNum;
    }

    public void setExcelNum(Long excelNum) {
        this.excelNum = excelNum;
    }
}
