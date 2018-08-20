package com.anycall.base.model.business.bo;

import java.util.List;

/**
 * Created by Amy on 2016/12/23.
 */
public class SortListServiceOrderBo extends SortListBo {

    private static final long serialVersionUID = 4942404032416152553L;

    private List<ServiceOrderBo> serviceOrderBoList;

    public List<ServiceOrderBo> getServiceOrderBoList() {
        return serviceOrderBoList;
    }

    public void setServiceOrderBoList(List<ServiceOrderBo> serviceOrderBoList) {
        this.serviceOrderBoList = serviceOrderBoList;
    }
}
