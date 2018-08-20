package com.anycall.base.model.general.vo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.ServiceCatalogLevel;
import com.anycall.base.model.general.ServiceCatalogTemplateLine;

import java.util.List;

/**
 * Created by .
 */
public class ServiceCatalogTemplateLineVo extends ServiceCatalogTemplateLine {

    //是否启用
    private Boolean enabled = false;


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
