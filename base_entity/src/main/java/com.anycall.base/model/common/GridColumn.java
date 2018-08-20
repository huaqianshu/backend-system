package com.anycall.base.model.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by lujun on 16/6/2.
 * Copyright © 2014-2016 ants-city.com
 */
public class GridColumn implements Serializable {

    private static final long serialVersionUID = 1878979767263294926L;

    private String text;

    private String dataIndex;

    public GridColumn() {
    }

    public GridColumn(String text, String dataIndex) {
        this.text = text;
        this.dataIndex = dataIndex;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GridColumn gridColumn = (GridColumn) o;
        return Objects.equals(text, gridColumn.text) &&
                Objects.equals(dataIndex, gridColumn.dataIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, dataIndex);
    }
}
