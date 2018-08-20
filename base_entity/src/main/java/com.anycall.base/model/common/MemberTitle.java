package com.anycall.base.model.common;

import java.io.Serializable;
import java.util.Date;

public class MemberTitle implements Serializable {
    private static final long serialVersionUID = -2314438654482431152L;

    private Long id;

    private Long memberid;

    private String titlevalue;

    private String type;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        this.titlevalue = titlevalue == null ? null : titlevalue.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}