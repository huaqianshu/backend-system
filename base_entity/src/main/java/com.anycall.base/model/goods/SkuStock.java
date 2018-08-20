package com.anycall.base.model.goods;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Amy on 2016/12/22.
 */
public class SkuStock extends AbstractPersistable {

    //货品ID
    private Long skuId;

    //库存数量
    private Integer stockNum = 0;

    //创建人
    private String creator;

    //创建时间
    private Date createTime;

    //更新人
    private String updater;

    //更新时间
    private Date updateTime;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
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
