package com.anycall.base.model.general.bo;

import com.anycall.base.model.general.NetArea;

import java.util.List;

/**
 * Created by admin on 2016/8/18.
 */
public class NetAreaBo extends NetArea {

    private static final long serialVersionUID = -6713761419589975736L;

    private String dispatcherNames;
    private String workerNames;

    private List<NetAreaLineBo> lines;

    public String getDispatcherNames() {
        return dispatcherNames;
    }

    public String getWorkerNames() {
        return workerNames;
    }

    public void setWorkerNames(String workerNames) {
        this.workerNames = workerNames;
    }

    public void setDispatcherNames(String dispatcherNames) {
        this.dispatcherNames = dispatcherNames;
    }

    public List<NetAreaLineBo> getLines() {
        return lines;
    }

    public void setLines(List<NetAreaLineBo> lines) {
        this.lines = lines;
    }
}
