package com.anycall.serviceorder.service;

import com.anycall.base.model.business.ServiceOrder;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;

import java.util.List;

public interface ServiceOrderService {
    List<ServiceOrder> searchCountBySlaLevel(ServiceOrderSearchPageCondition searchCondition);
}
