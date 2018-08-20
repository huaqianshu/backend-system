package com.anycall.base.model.report;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.Region;

/**
 * 施工完成报表
 */
public class CompleteRepair extends AbstractPersistable {

    private static final long serialVersionUID = -6248848301118439855L;
    //区域
    private Region region;
    //接单数
    private Integer receivedQty;
    //完工数
    private Integer completeQty;
    //未完工数
    private Integer uncompleteQty;
    //完成率
    private Double completeRate;
    //店铺数
    private Integer shopQty;
    //接单数/店
    private Double receivedRate;

    private String stateName;

    private Long stateId;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Integer getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(Integer receivedQty) {
        this.receivedQty = receivedQty;
    }

    public Integer getCompleteQty() {
        return completeQty;
    }

    public void setCompleteQty(Integer completeQty) {
        this.completeQty = completeQty;
    }

    public Integer getUncompleteQty() {
        return uncompleteQty;
    }

    public void setUncompleteQty(Integer uncompleteQty) {
        this.uncompleteQty = uncompleteQty;
    }

    public Double getCompleteRate() {
        return completeRate;
    }

    public void setCompleteRate(Double completeRate) {
        this.completeRate = completeRate;
    }

    public Integer getShopQty() {
        return shopQty;
    }

    public void setShopQty(Integer shopQty) {
        this.shopQty = shopQty;
    }

    public Double getReceivedRate() {
        return receivedRate;
    }

    public void setReceivedRate(Double receivedRate) {
        this.receivedRate = receivedRate;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }
}
