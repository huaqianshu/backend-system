package com.anycall.serviceorder.mapper.order;


import com.anycall.base.model.business.ServiceOrder;

import com.anycall.base.model.business.bo.PlatformDashboardStatisticBo;
import com.anycall.base.model.business.bo.ServiceOrderBo;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServiceOrderMapper {
    public ServiceOrder findById(Long id);

    int searchServiceOrderCount(ServiceOrderSearchPageCondition searchCondition);

    List<ServiceOrder> searchCountBySlaLevel(ServiceOrderSearchPageCondition condition);

    List<ServiceOrderBo> searchList(ServiceOrderSearchPageCondition searchCondition);

    Integer searchListCount(ServiceOrderSearchPageCondition searchCondition);
//    List<PlatformDashboardStatisticBo> searchPlatformDashboardData(OperatingsCondition condition);

//    List<ServiceOrderApiBo> selectServiceOrderByUpdateTime(ServiceApi serviceApi);

//    Integer searchListDashboardCount(OperatingsCondition condition);
}
