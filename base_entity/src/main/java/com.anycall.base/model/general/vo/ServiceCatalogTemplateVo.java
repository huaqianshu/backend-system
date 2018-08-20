package com.anycall.base.model.general.vo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.ServiceCatalog;
import com.anycall.base.model.general.ServiceCatalogTemplate;
import com.anycall.base.model.general.ServiceCatalogTemplateLine;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

/**
 * Created by .
 */
public class ServiceCatalogTemplateVo extends ServiceCatalogTemplate {

    List<ServiceCatalogTemplateLine> serviceCataloglines;

    public List<ServiceCatalogTemplateLine> getServiceCataloglines() {
        return serviceCataloglines;
    }

    public void setServiceCataloglines(List<ServiceCatalogTemplateLine> serviceCataloglines) {
        this.serviceCataloglines = serviceCataloglines;
    }
}
