package com.anycall.base.model.goods;

import com.anycall.base.model.AbstractPersistable;

public class Sku extends AbstractPersistable {

	private static final long serialVersionUID = -3599618588836431432L;

	private String skuCode;

	//规格描述
	private String skuSpec;

	//商品id
	private Long itemId;

	//单位
	private String unit;

	//销售价
	private Double salePrice;

	//成本价/供货结算价
	private Double costPrice;
	private Double taxRate;
	//备注
	private String skuMemo;
	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getSkuSpec() {
		return skuSpec;
	}

	public void setSkuSpec(String skuSpec) {
		this.skuSpec = skuSpec;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public String getSkuMemo() {
		return skuMemo;
	}

	public void setSkuMemo(String skuMemo) {
		this.skuMemo = skuMemo;
	}
}
