package com.anycall.base.model.business.vo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.ServiceOrder;

import java.util.List;

/**
 * Created by Robin on 16/8/30.
 */
public class ServiceOrderConfirmVo extends AbstractPersistable {

    private static final long serialVersionUID = 7293517149058733526L;

    private String callNo;

    private String reportManEx;

    private String reportManTelEx;

    private String shopCodeEx;

    private String shopNameEx;

    private  String addressEx;

    private  String phoneNumEx;

    private  String brandNameEx;

    private  String stateNameEx;

    private  String cityNameEx;

    private  String districtNameEx;

    private List<ServiceOrder> serviceOrders;

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getReportManEx() {
        return reportManEx;
    }

    public void setReportManEx(String reportManEx) {
        this.reportManEx = reportManEx;
    }

    public String getReportManTelEx() {
        return reportManTelEx;
    }

    public void setReportManTelEx(String reportManTelEx) {
        this.reportManTelEx = reportManTelEx;
    }

    public String getShopCodeEx() {
        return shopCodeEx;
    }

    public void setShopCodeEx(String shopCodeEx) {
        this.shopCodeEx = shopCodeEx;
    }

    public String getShopNameEx() {
        return shopNameEx;
    }

    public void setShopNameEx(String shopNameEx) {
        this.shopNameEx = shopNameEx;
    }

    public String getAddressEx() {
        return addressEx;
    }

    public void setAddressEx(String addressEx) {
        this.addressEx = addressEx;
    }

    public String getPhoneNumEx() {
        return phoneNumEx;
    }

    public void setPhoneNumEx(String phoneNumEx) {
        this.phoneNumEx = phoneNumEx;
    }

    public List<ServiceOrder> getServiceOrders() {
        return serviceOrders;
    }

    public void setServiceOrders(List<ServiceOrder> serviceOrders) {
        this.serviceOrders = serviceOrders;
    }

    public String getBrandNameEx() {
        return brandNameEx;
    }

    public void setBrandNameEx(String brandNameEx) {
        this.brandNameEx = brandNameEx;
    }

    public String getStateNameEx() {
        return stateNameEx;
    }

    public void setStateNameEx(String stateNameEx) {
        this.stateNameEx = stateNameEx;
    }

    public String getCityNameEx() {
        return cityNameEx;
    }

    public void setCityNameEx(String cityNameEx) {
        this.cityNameEx = cityNameEx;
    }

    public String getDistrictNameEx() {
        return districtNameEx;
    }

    public void setDistrictNameEx(String districtNameEx) {
        this.districtNameEx = districtNameEx;
    }
}
