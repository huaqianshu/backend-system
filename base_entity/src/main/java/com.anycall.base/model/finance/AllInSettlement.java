package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Auser on 2016/9/26.
 */
public class AllInSettlement extends AbstractPersistable {
    private static final long serialVersionUID = 4336667297614817297L;
    //    所属门店
    private String shopCode;
    //    统包金额
    private Double allInPrice;
    //    所属年份
    private Integer year;
    //    所属月份0-11
    private Integer month;
    //状态：已结算、未结算
    private AllInSettlementStatus status;
    //公司
    private Long companyId;
    //组织
    private Long orgId;
    //合约
    private Long contractId;

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Double getAllInPrice() {
        return allInPrice;
    }

    public void setAllInPrice(Double allInPrice) {
        this.allInPrice = allInPrice;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public AllInSettlementStatus getStatus() {
        return status;
    }

    public void setStatus(AllInSettlementStatus status) {
        this.status = status;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
}
