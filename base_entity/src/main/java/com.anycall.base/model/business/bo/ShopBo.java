package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.vo.ShopVo;

import java.util.List;


public class ShopBo extends ShopVo {
    private static final long serialVersionUID = 721023268244765895L;
    private String companyName;
    private String companyBrandName;
    private long excelNum;//用于存储门店导入功能excel错误行的行编号
    private String errorMessage;//门店导入功能具体的错误信息
    private Boolean contractFlg;
    private int orderCount;


    //服务单号列表
    private List<String> orderNos;

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public List<String> getOrderNos() {
        return orderNos;
    }

    public void setOrderNos(List<String> orderNos) {
        this.orderNos = orderNos;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getExcelNum() {
        return excelNum;
    }

    public void setExcelNum(long excelNum) {
        this.excelNum = excelNum;
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

    public Boolean getContractFlg() {
        return contractFlg;
    }

    public void setContractFlg(Boolean contractFlg) {
        this.contractFlg = contractFlg;
    }
}
