package com.anycall.base.model.common.chart;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by hachi on  17/2/28.
 * 统计图的字段
 * Copyright © 2014-2016 ants-city.com
 */
public class ChartField extends AbstractPersistable {
    private static final long serialVersionUID = -2398213337680342174L;
    //饼状图
    private String os;
    private Double data1;
    private String num;

    public Double getData1() {
        return data1;
    }

    public void setData1(Double data1) {
        this.data1 = data1;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
}
