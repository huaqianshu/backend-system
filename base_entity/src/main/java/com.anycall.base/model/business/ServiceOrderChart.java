package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Auser on 2017/6/12.
 */
public class ServiceOrderChart extends AbstractPersistable {

    private static final long serialVersionUID = 1286662067645383036L;

    private String type;
    private String rate;
    private Integer quantity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public ServiceOrderChart(Long id, String type, String rate, Integer quantity) {
        this.setId(id);
        this.type = type;
        this.rate = rate;
        this.quantity = quantity;
    }
}
