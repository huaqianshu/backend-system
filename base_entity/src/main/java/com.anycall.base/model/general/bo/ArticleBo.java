package com.anycall.base.model.general.bo;


import com.anycall.base.model.general.Article;

/**
 * Created by Auser on 2016/8/24.
 */
public class ArticleBo extends Article {

    private static final long serialVersionUID = -5967117615937915331L;
    private String catName;
    private String orgType;

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
