package com.anycall.base.common;

import java.util.Objects;

public class PageCondition implements BaseCondition {

    private static final long serialVersionUID = -2869267930670674346L;
    protected Long memberId =0l;
    protected Integer start = 0;

    protected Integer limit = 30;

    protected String sortProperty;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    protected String sortDirection;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSortProperty() {
        return sortProperty;
    }

    public void setSortProperty(String sortProperty) {
        this.sortProperty = sortProperty;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageCondition that = (PageCondition) o;
        return Objects.equals(memberId, that.memberId) &&
                Objects.equals(start, that.start) &&
                Objects.equals(limit, that.limit) &&
                Objects.equals(sortProperty, that.sortProperty) &&
                Objects.equals(sortDirection, that.sortDirection);
    }

    @Override
    public int hashCode() {

        return Objects.hash(memberId, start, limit, sortProperty, sortDirection);
    }
}
