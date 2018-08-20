package com.anycall.base.model.business.condition;

import com.anycall.base.common.PageCondition;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Copyright © 2014-2016 ants-city.com
 */
public class MemberTitleCondition extends PageCondition {

    private static final long serialVersionUID = -4883612344524026818L;

    private Long memberid;

    private String titlevalue;

    private String type;

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public String getTitlevalue() {
        return titlevalue;
    }

    public void setTitlevalue(String titlevalue) {
        this.titlevalue = titlevalue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MemberTitleCondition that = (MemberTitleCondition) o;
        return Objects.equals(memberid, that.memberid) &&
                Objects.equals(titlevalue, that.titlevalue) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), memberid, titlevalue, type);
    }


    @Override
    public String toString() {
        return "MemberTitleCondition{" +
                "memberid=" + memberid +
                ", titlevalue='" + titlevalue + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
