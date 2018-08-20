package com.anycall.base.model.goods;
import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Item extends AbstractPersistable {

	private static final long serialVersionUID = 1845169819637823435L;

	private String itemCode;

	private String itemName;

	//发布公司
	private Long orgId;

	//类目
	private Long catId;

	//类目全路径,如: /1/1/3
	private String catPath;

	//品牌
	private Long brandId;

	//主图
	private String defaultImgUrl;

	//关键字
	private String keywords;

	//概述
	private String memo;

	//是否启用规格
	private Boolean isUseSpec = false;

	//是否可用
	private Boolean enabled = true;

	//是否删除
	@JsonIgnore
	private boolean deleted = true;

	//创建人
	private String creator;

	//创建时间
	private Date createTime;

	//更新人
	private String updater;

	//更新时间
	private Date updateTime;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCatPath() {
		return catPath;
	}

	public void setCatPath(String catPath) {
		this.catPath = catPath;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getDefaultImgUrl() {
		return defaultImgUrl;
	}

	public void setDefaultImgUrl(String defaultImgUrl) {
		this.defaultImgUrl = defaultImgUrl;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Boolean getIsUseSpec() {
		return isUseSpec;
	}

	public void setIsUseSpec(Boolean useSpec) {
		isUseSpec = useSpec;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
