package com.anycall.base.model.common;

public enum MissionSource {
    WORKORDEROVERDUE("workorder_overdue"),
    WORKORDERAPPROVAL("workorder_approval"),
    LOSETOUCHTODAY("lose_touch_today"),
    LOSETOUCHONEHOUR("lose_touch_one_hour"),
    WORKEROVERDUE("worker_overdue"),
    TOOFARFROMNEXTORDER("too_far_from_nextorder"),
    CANTFIND("cant_find");
    private String desc;//中文描述
    private MissionSource(String desc){
        this.desc=desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
