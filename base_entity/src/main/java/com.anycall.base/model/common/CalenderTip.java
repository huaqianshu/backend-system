package com.anycall.base.model.common;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by yubotao on 16/9/29.app 日历提醒model
 */
public class CalenderTip extends AbstractPersistable {

    private String date;

    private Long count;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
