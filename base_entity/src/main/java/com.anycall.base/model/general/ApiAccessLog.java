package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Amy on 2017/1/11.
 */
public class ApiAccessLog  extends AbstractPersistable{

    private static final long serialVersionUID = 8362192070191922785L;

    //API调用者用户名
    private String username;

    //客户端ip
    private String remoteIp;

    //调用时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
    private Date callTime;

    //API调用名称
    private String apiName;

    //API版本
    private String version;

    //返回是否成功
    private boolean retSuccess;

    //API调用的request数据
    private String request;

    //返回的response
    private String response;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isRetSuccess() {
        return retSuccess;
    }

    public void setRetSuccess(boolean retSuccess) {
        this.retSuccess = retSuccess;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
