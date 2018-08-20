package com.anycall.base.model.goods.bo;

import com.anycall.base.model.goods.vo.ItemVo;

/**
 * 后端查询出来的商品结果对象
 * Created by lujun on 16/6/23.
 * Copyright © 2014-2016 ants-city.com
 */
public class ItemBo extends ItemVo {

    private static final long serialVersionUID = -7574322377522250457L;

    private String orgName;

    private String catName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
