package com.anycall.base.model.goods;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Category extends AbstractPersistable {

    private static final long serialVersionUID = -2749093716006628174L;

    //品牌名称
    private String catName;

    //父节点
    private Long parentId = 0L;

    //是否叶子节点
    private Boolean leaf;

    //品牌描述
    private String catDesc;

    //类目路径
    private  String catPath;

	//是否已删除
	@JsonIgnore
	private boolean deleted = false;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public String getCatPath() {
        return catPath;
    }

    public void setCatPath(String catPath) {
        this.catPath = catPath;
    }

    public boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
