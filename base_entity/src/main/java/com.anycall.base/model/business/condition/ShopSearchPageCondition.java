package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by yubotao on 16/7/25.
 */
public class ShopSearchPageCondition extends QuickSearchOrgPageCondition {
    
    private static final long serialVersionUID = -169423417966764867L;

    private Long companyId;

    private Long brandId;

    private  String region;

    private  Long cityId;

    private  Long districtId;

    private  Long stateId;

    private Boolean enabled;

    private List<Long> orgTreeIds;

    private Boolean searchNetAreaShop=false;

    private List<String> shopCodes;

    //是否是门店管理查询
    private Boolean shopManage=false;

    private Boolean closed;

    private List<String> maskShopCodes;

    private String contractStatus;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public Boolean getSearchNetAreaShop() {
        return searchNetAreaShop;
    }

    public void setSearchNetAreaShop(Boolean searchNetAreaShop) {
        this.searchNetAreaShop = searchNetAreaShop;
    }

    public List<String> getShopCodes() {
        return shopCodes;
    }

    public void setShopCodes(List<String> shopCodes) {
        this.shopCodes = shopCodes;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Boolean getShopManage() {
        return shopManage;
    }

    public void setShopManage(Boolean shopManage) {
        this.shopManage = shopManage;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public List<String> getMaskShopCodes() {
        return maskShopCodes;
    }

    public void setMaskShopCodes(List<String> maskShopCodes) {
        this.maskShopCodes = maskShopCodes;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShopSearchPageCondition condition = (ShopSearchPageCondition) o;
        return Objects.equals(companyId, condition.companyId) &&
                Objects.equals(brandId, condition.brandId) &&
                Objects.equals(region, condition.region) &&
                Objects.equals(cityId, condition.cityId) &&
                Objects.equals(districtId, condition.districtId) &&
                Objects.equals(stateId, condition.stateId) &&
                Objects.equals(enabled, condition.enabled) &&
                Objects.equals(orgTreeIds, condition.orgTreeIds) &&
                Objects.equals(searchNetAreaShop, condition.searchNetAreaShop) &&
                Objects.equals(shopCodes, condition.shopCodes) &&
                Objects.equals(shopManage, condition.shopManage) &&
                Objects.equals(closed, condition.closed) &&
                Objects.equals(maskShopCodes, condition.maskShopCodes) &&
                Objects.equals(contractStatus, condition.contractStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), companyId, brandId, region, cityId, districtId, stateId, enabled, orgTreeIds, searchNetAreaShop, shopCodes, shopManage, closed, maskShopCodes, contractStatus);
    }
}
