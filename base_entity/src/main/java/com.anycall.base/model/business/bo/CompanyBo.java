package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.CompanyBrand;
import com.anycall.base.model.business.Shop;
import com.anycall.base.model.business.vo.CompanyVo;

import java.util.List;

/**
 * Created by yubotao on 16/8/15.
 */
public class CompanyBo extends CompanyVo {

    private String brandName;


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
