package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

/**
 * Created by Hachi on 2016/12/1.
 */
public class Article extends AbstractPersistable {

    private static final long serialVersionUID = -4301581261350584706L;
    //文章分类id
    private Long catId;

    //文章标题
    private String title;

    //文章简介
    private String brief;

    //文章内容
    private String content;

    //是否发布
    private Boolean isPublish;

    //作者
    private String creator;

    //创建时间
    private Date createTime;

    //更新人
    private String updater;

    //更新时间
    private Date updateTime;

    //是否删除
    private Boolean deleted = false;

    //类型
    private ArticleType type;

    private String videoUrl;

    private String voiceUrl;

    private String pdfUrl;

    public ArticleType getType() {
        return type;
    }

    public void setType(ArticleType type) {
        this.type = type;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
