package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.SortList;

import java.util.List;

/**
 * Created by hachi on 20116/10/13.
 */
public class SortListVo extends SortList {
    private static final long serialVersionUID = 4577803549761665255L;

    private Long shopId;
    private String imageUrls;
    private String recordUrls;
    private String loginName;
    private List<String> photographUrls;
    private List<String> soundUrls;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getRecordUrls() {
        return recordUrls;
    }

    public void setRecordUrls(String recordUrls) {
        this.recordUrls = recordUrls;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public List<String> getPhotographUrls() {
        return photographUrls;
    }

    public void setPhotographUrls(List<String> photographUrls) {
        this.photographUrls = photographUrls;
    }

    public List<String> getSoundUrls() {
        return soundUrls;
    }

    public void setSoundUrls(List<String> soundUrls) {
        this.soundUrls = soundUrls;
    }
}
