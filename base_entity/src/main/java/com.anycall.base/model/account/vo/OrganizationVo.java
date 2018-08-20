package com.anycall.base.model.account.vo;

import com.anycall.base.model.account.Department;
import com.anycall.base.model.account.Organization;

import java.util.List;


/**
 * Created by yubotao on 16/8/3.
 */
public class OrganizationVo extends Organization {

    private static final long serialVersionUID = 5909868379355957108L;

    private Long memId;
    private String passwdHash;
    private String loginName;
    private List<Department> departments;
    private Boolean existInServeContract;

    public Long getMemId() {
        return memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public String getPasswdHash() {
        return passwdHash;
    }

    public void setPasswdHash(String passwdHash) {
        this.passwdHash = passwdHash;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Boolean getExistInServeContract() {
        return existInServeContract;
    }

    public void setExistInServeContract(Boolean existInServeContract) {
        this.existInServeContract = existInServeContract;
    }
}
