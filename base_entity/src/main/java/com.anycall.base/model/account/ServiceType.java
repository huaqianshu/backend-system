package com.anycall.base.model.account;

/**
 * Created by yz on 2017/10/16.
 */
public enum ServiceType {
    //设备、设施、设备和设施
    EQUIPMENT,FACILITY,EQUIPMENT_FACILITY;

    public ServiceType getServiceType(String param){
        for(ServiceType s:ServiceType.values()){
            if(s.toString().equals(param)){
                return s;
            }
        }
        return null;
    }
}
