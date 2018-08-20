package com.anycall.base.model.general.bo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.Contract;
import com.anycall.base.model.account.Organization;
import com.anycall.base.model.general.CatalogType;
import com.anycall.base.model.general.ServiceCatalog;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

/**
 * Created by .
 */
public class ServiceCatalogBo extends ServiceCatalog {

    public List<ServiceCatalogBo> children;

    public List<ServiceCatalogBo> getChildren() {
        return children;
    }

    public void setChildren(List<ServiceCatalogBo> children) {
        this.children = children;
    }
}
