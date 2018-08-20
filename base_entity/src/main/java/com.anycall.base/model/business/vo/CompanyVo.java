package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.Company;
import com.anycall.base.model.business.CompanyBrand;
import com.anycall.base.model.business.Shop;

import java.util.List;

/**
 * Created by yubotao on 16/7/25.
 */
public class CompanyVo extends Company {


    private List<Shop> shops;
    private  List<CompanyBrand> companyBrand;

    public List<CompanyBrand> getCompanyBrand() {
        return companyBrand;
    }

    public void setCompanyBrand(List<CompanyBrand> companyBrand) {
        this.companyBrand = companyBrand;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }




}
