package com.anycall.base.model.business.bo;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Auser on 2016/10/20.
 */
public class IntelligenceSendWorkBo implements Serializable {

    private static final long serialVersionUID = 5118578209700811480L;

    private long successCount;
    private long failCount;

    private List<HashMap<String,Object>> worker;
    private List<HashMap<String,Object>> failMessage;

    public List<HashMap<String, Object>> getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(List<HashMap<String, Object>> failMessage) {
        this.failMessage = failMessage;
    }

    public List<HashMap<String,Object>> getWorker() {
        return worker;
    }

    public void setWorker(List<HashMap<String,Object>> worker) {
        this.worker = worker;
    }

    public long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(long successCount) {
        this.successCount = successCount;
    }

    public long getFailCount() {
        return failCount;
    }

    public void setFailCount(long failCount) {
        this.failCount = failCount;
    }
}
