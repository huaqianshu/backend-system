package com.anycall.base.model.general;


import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Hachi on 2016/12/1.
 */
public class ArticleCat extends AbstractPersistable {


    private static final long serialVersionUID = 3225207762930037843L;
    //组织类型
    private String orgTypes;

    //分类名称
    private String catName;

    //顺序
    private Long priority = 0L;

    //是否删除
    private Boolean deleted = false;

    public String getOrgTypes() {
        return orgTypes;
    }

    public void setOrgTypes(String orgTypes) {
        this.orgTypes = orgTypes;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
