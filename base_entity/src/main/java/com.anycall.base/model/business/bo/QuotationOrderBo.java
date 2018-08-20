package com.anycall.base.model.business.bo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.vo.QuotationOrderVo;
import com.anycall.base.model.general.Region;

import java.util.Date;
import java.util.List;


public class QuotationOrderBo extends AbstractPersistable {

    //单号
    private String alwaysQuotationOrderNo;

    //品牌
    private String brandName;

    //门店
    private String shopName;

    //门店编码
    private String shopCode;

    //是否在保
    private Boolean isInService;

    //地区
    private Region region;

    //项目经理
    private String dispatcherName;



    //总报价
    private Double alwaysquoteTotals;

    //总成本
    private Double alwayscostTotals;

    //总毛利率
    private Double alwaysgrossProfitRate;

    //最后更新时间
    private Date updateTime;

    List<QuotationOrderVo> quoList;

    //企业
    private String companyName;

    private int quoListSize;

    List<Long> quoIdList;

    public Boolean getInService() {
        return isInService;
    }

    public void setInService(Boolean inService) {
        isInService = inService;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Long> getQuoIdList() {
        return quoIdList;
    }

    public void setQuoIdList(List<Long> quoIdList) {
        this.quoIdList = quoIdList;
    }

    public int getQuoListSize() {
        return quoListSize;
    }

    public void setQuoListSize(int quoListSize) {
        this.quoListSize = quoListSize;
    }

    public String getAlwaysQuotationOrderNo() {
        return alwaysQuotationOrderNo;
    }

    public void setAlwaysQuotationOrderNo(String alwaysQuotationOrderNo) {
        this.alwaysQuotationOrderNo = alwaysQuotationOrderNo;
    }
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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

    public Double getAlwaysquoteTotals() {
        return alwaysquoteTotals;
    }

    public void setAlwaysquoteTotals(Double alwaysquoteTotals) {
        this.alwaysquoteTotals = alwaysquoteTotals;
    }

    public Double getAlwayscostTotals() {
        return alwayscostTotals;
    }

    public void setAlwayscostTotals(Double alwayscostTotals) {
        this.alwayscostTotals = alwayscostTotals;
    }

    public Double getAlwaysgrossProfitRate() {
        return alwaysgrossProfitRate;
    }

    public void setAlwaysgrossProfitRate(Double alwaysgrossProfitRate) {
        this.alwaysgrossProfitRate = alwaysgrossProfitRate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<QuotationOrderVo> getQuoList() {
        return quoList;
    }

    public void setQuoList(List<QuotationOrderVo> quoList) {
        this.quoList = quoList;
    }

    public String getDispatcherName() {
        return dispatcherName;
    }

    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }
}
