package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.CompanyBrand;
import com.anycall.base.model.goods.Brand;

/**
 * Created by admin on 2016/7/29.
 */
public class CompanyBrandBo extends CompanyBrand {

    private static final long serialVersionUID = 13504820667161723L;
    //行业类型名称
    private String industryName;

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }


}
