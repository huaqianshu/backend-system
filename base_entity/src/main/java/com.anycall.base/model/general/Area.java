package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by Robin on 16/7/7.
 */
public class Area extends AbstractPersistable {


    private static final long serialVersionUID = -3412445402470383550L;

    //地区名称
    private String areaName;

    //父节点
    private Long parentId = 0L;

    //描述
    private String memo;

    //层级1,2,3,4省 市 区 街道
    private Integer level;

    //是否叶子节点
    private boolean leaf=false;

    //是否已删除
    @JsonIgnore
    private boolean deleted = false;


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
