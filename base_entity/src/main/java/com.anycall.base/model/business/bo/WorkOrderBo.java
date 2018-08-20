package com.anycall.base.model.business.bo;

import com.anycall.base.model.account.ContractServiceCatalogType;
import com.anycall.base.model.business.QuotationOrder;
import com.anycall.base.model.business.vo.WorkOrderVo;
import com.anycall.base.model.general.Region;

import java.util.Date;

/**
 * Created by Robin on 16/8/30.
 */
public class WorkOrderBo extends WorkOrderVo {

    private static final long serialVersionUID = 5918578609700811480L;

    private String staffName;

    private String staffTel;

    private String dispatcherName;

    private String dispatcherPhone;

    private String shopAreaName;

    private Region region;

    private String shopAddress;

    private String netAreaName;

    private String supplierName;

    private String brandName;

    private String shopName;

    private String contractName;

    private String contractCode;

    //是否可以派单
    private Boolean ableSendOrder;

    //是否可以创建平行单
    private Boolean ableCreateParallelOrder;

    //服务单创建时间
    private Date serviceOrderCreateTime;
    private Long serviceOrderCreateTimeAsLong;

    private String printEstimatedStartTime;
    private Long printEstimatedStartTimeAsLong;

    private String printCreateTime;
    private Long printCreateTimeAsLong;

    private String printDesc;

    //合并报价单号
    private String merQuotationOrderId;
    private String merQuotationOrderNo;
    //对应服务单上的有效报价单
    private QuotationOrder quotationOrder;
    private Boolean whetherApprove;

    private Double shopLon;
    private Double shopLat;
    private Double workerLon;
    private Double workerLat;

    public Double getShopLon() {
        return shopLon;
    }

    public void setShopLon(Double shopLon) {
        this.shopLon = shopLon;
    }

    public Double getShopLat() {
        return shopLat;
    }

    public void setShopLat(Double shopLat) {
        this.shopLat = shopLat;
    }

    public Double getWorkerLon() {
        return workerLon;
    }

    public void setWorkerLon(Double workerLon) {
        this.workerLon = workerLon;
    }

    public Double getWorkerLat() {
        return workerLat;
    }

    public void setWorkerLat(Double workerLat) {
        this.workerLat = workerLat;
    }

    public QuotationOrder getQuotationOrder() {
        return quotationOrder;
    }

    public void setQuotationOrder(QuotationOrder quotationOrder) {
        this.quotationOrder = quotationOrder;
    }

    private ContractServiceCatalogType contractServiceCatalogType=ContractServiceCatalogType.DAILY;

    public ContractServiceCatalogType getContractServiceCatalogType() {
        return contractServiceCatalogType;
    }

    public void setContractServiceCatalogType(ContractServiceCatalogType contractServiceCatalogType) {
        this.contractServiceCatalogType = contractServiceCatalogType;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getDispatcherName() {
        return dispatcherName;
    }

    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }

    public String getShopAreaName() {
        return shopAreaName;
    }

    public void setShopAreaName(String shopAreaName) {
        this.shopAreaName = shopAreaName;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getNetAreaName() {
        return netAreaName;
    }

    public void setNetAreaName(String netAreaName) {
        this.netAreaName = netAreaName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public Boolean getAbleSendOrder() {
        return ableSendOrder;
    }

    public void setAbleSendOrder(Boolean ableSendOrder) {
        this.ableSendOrder = ableSendOrder;
    }

    public Boolean getAbleCreateParallelOrder() {
        return ableCreateParallelOrder;
    }

    public void setAbleCreateParallelOrder(Boolean ableCreateParallelOrder) {
        this.ableCreateParallelOrder = ableCreateParallelOrder;
    }

    public Date getServiceOrderCreateTime() {
        return serviceOrderCreateTime;
    }

    public void setServiceOrderCreateTime(Date serviceOrderCreateTime) {
        this.serviceOrderCreateTime = serviceOrderCreateTime;
    }

    public String getPrintEstimatedStartTime() {
        return printEstimatedStartTime;
    }

    public void setPrintEstimatedStartTime(String printEstimatedStartTime) {
        this.printEstimatedStartTime = printEstimatedStartTime;
    }

    public String getPrintCreateTime() {
        return printCreateTime;
    }

    public void setPrintCreateTime(String printCreateTime) {
        this.printCreateTime = printCreateTime;
    }

    public String getMerQuotationOrderId() {
        return merQuotationOrderId;
    }

    public void setMerQuotationOrderId(String merQuotationOrderId) {
        this.merQuotationOrderId = merQuotationOrderId;
    }

    public String getMerQuotationOrderNo() {
        return merQuotationOrderNo;
    }

    public void setMerQuotationOrderNo(String merQuotationOrderNo) {
        this.merQuotationOrderNo = merQuotationOrderNo;
    }

    public String getPrintDesc() {
        return printDesc;
    }

    public void setPrintDesc(String printDesc) {
        this.printDesc = printDesc;
    }

    public Boolean getWhetherApprove() {
        return whetherApprove;
    }

    public void setWhetherApprove(Boolean whetherApprove) {
        this.whetherApprove = whetherApprove;
    }


    public String getDispatcherPhone() {
        return dispatcherPhone;
    }

    public void setDispatcherPhone(String dispatcherPhone) {
        this.dispatcherPhone = dispatcherPhone;
    }
}
