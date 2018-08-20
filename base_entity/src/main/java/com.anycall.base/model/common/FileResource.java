package com.anycall.base.model.common;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Robin on 16/9/14.
 */
public class FileResource extends AbstractPersistable {

    private static final long serialVersionUID = -2770536772630408442L;

    private String modelType;

    private String modelId;

    private FileResourceType type;

    private String url;

    private String memo;

    private String operator;

    private Date updateTime;

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public FileResourceType getType() {
        return type;
    }

    public void setType(FileResourceType type) {
        this.type = type;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
