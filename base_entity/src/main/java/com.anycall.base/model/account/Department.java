package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;


public class Department extends AbstractPersistable {

    private static final long serialVersionUID = -7113818798209343957L;

    private Long orgId;

    private String departmentCode;

    private String departmentName;

    private String description;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
