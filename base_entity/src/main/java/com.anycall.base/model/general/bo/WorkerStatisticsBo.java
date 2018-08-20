package com.anycall.base.model.general.bo;

import com.anycall.base.model.general.WorkerStatistics;

/**
 * Created by Amy on 2016/12/19.
 */
public class WorkerStatisticsBo extends WorkerStatistics {
    private String workerName;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }
}
