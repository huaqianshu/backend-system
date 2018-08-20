package com.anycall.base.model.common;

import com.anycall.base.model.general.vo.BizLogVo;

import java.util.List;

/**
 * Created by Robin on 16/11/17.
 */
public class ServiceOrderOverallDetail extends ServiceOrderOverallDetailForUniqlo {

    private static final long serialVersionUID = 7168147312815370993L;

    private List<BizLogVo> overallBizLogs;

    public List<BizLogVo> getOverallBizLogs() {
        return overallBizLogs;
    }

    public void setOverallBizLogs(List<BizLogVo> overallBizLogs) {
        this.overallBizLogs = overallBizLogs;
    }
}
