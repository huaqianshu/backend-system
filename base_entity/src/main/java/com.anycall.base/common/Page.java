package com.anycall.base.common;

/**
 * Created by lujun on 16/5/27.
 * Copyright © 2014-2016 ants-city.com
 */

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
    private static final long serialVersionUID = 3200069927678126482L;

    private List<T> results;
    private Integer total;

    public Page() {
    }

    public Page(List<T> results, int total) {
        this.results = results;
        this.total = total;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResults() {
        return this.results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
