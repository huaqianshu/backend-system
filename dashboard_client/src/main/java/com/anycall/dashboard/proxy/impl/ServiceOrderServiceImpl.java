package com.anycall.dashboard.proxy.impl;

import com.alibaba.fastjson.JSON;
import com.anycall.base.messager.ResultBean;
import com.anycall.base.model.User;
import com.anycall.base.model.account.Member;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;
import com.anycall.dashboard.proxy.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Component
public class ServiceOrderServiceImpl implements ServiceOrderService {

    @Override
    public ResultBean getServiceOrderCountBarChart(ServiceOrderSearchPageCondition condition) {
        System.out.println(JSON.toJSON(condition));
        return null;
    }

    @Override
    public String testConnect(String name) {
        return null;
    }

    @Override
    public ResultBean testEntity(ServiceOrderSearchPageCondition condition) {
        return null;
    }
}
