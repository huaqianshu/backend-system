package com.anycall.serviceorder.service.impl;

import com.anycall.base.model.business.ServiceOrder;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;
import com.anycall.serviceorder.mapper.order.ServiceOrderMapper;
import com.anycall.serviceorder.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceOrderServiceImpl implements ServiceOrderService {
    @Autowired
    private ServiceOrderMapper serviceOrderMapper;
    @Override
    public List<ServiceOrder> searchCountBySlaLevel(ServiceOrderSearchPageCondition searchCondition) {
        return serviceOrderMapper.searchCountBySlaLevel(searchCondition);
    }
}
