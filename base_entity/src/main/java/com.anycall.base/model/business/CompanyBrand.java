package com.anycall.base.model.business;
import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CompanyBrand extends AbstractPersistable {

	private static final long serialVersionUID = -1146720499784142152L;

	//行业类型
	private Long industryId;

	//品牌名称
	private String brandName;

	//品牌描述
	private String brandDesc;

	private String brandMemo;

	//品牌Logo
	private String brandLogo;


	//是否启用
	private Boolean enabled = true;

	//是否已删除
	@JsonIgnore
	private Boolean deleted = false;

	//是否热门
	private Boolean pop= false;

	public Boolean getPop() {
		return pop;
	}

	public void setPop(Boolean pop) {
		this.pop = pop;
	}

	public Long getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}

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

	public String getBrandMemo() {
		return brandMemo;
	}

	public void setBrandMemo(String brandMemo) {
		this.brandMemo = brandMemo;
	}
}
