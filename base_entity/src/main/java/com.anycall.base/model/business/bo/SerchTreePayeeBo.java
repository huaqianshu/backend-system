package com.anycall.base.model.business.bo;

import com.anycall.base.model.AbstractPersistable;

import java.util.List;


public class SerchTreePayeeBo extends AbstractPersistable {

    private Long reimbursementId;

    private String payeeName;
    private String payeeNameAndCity;
    //层级1,2,3
    private Integer level;

    //是否叶子节点
    private Boolean leaf=false;

    private Boolean checked=false;

    private Boolean holding=false;

    private String iconCls = "tree-node-hidden-icon-cls";

    public List<SerchTreePayeeBo> children;

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public List<SerchTreePayeeBo> getChildren() {
        return children;
    }

    public void setChildren(List<SerchTreePayeeBo> children) {
        this.children = children;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public Boolean getHolding() {
        return holding;
    }

    public void setHolding(Boolean holding) {
        this.holding = holding;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getPayeeNameAndCity() {
        return payeeNameAndCity;
    }

    public void setPayeeNameAndCity(String payeeNameAndCity) {
        this.payeeNameAndCity = payeeNameAndCity;
    }
}
