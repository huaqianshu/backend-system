package com.anycall.base.model.goods;
import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Brand extends AbstractPersistable {

	private static final long serialVersionUID = -1146720499784142152L;

	//品牌名称
	private String brandName;

	//品牌描述
	private String brandDesc;

	//品牌Logo
	private String brandLogo;

	//是否启用
	private Boolean enabled = true;

	//是否已删除
	@JsonIgnore
	private Boolean deleted = false;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandDesc() {
		return brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}

	public String getBrandLogo() {
		return brandLogo;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
