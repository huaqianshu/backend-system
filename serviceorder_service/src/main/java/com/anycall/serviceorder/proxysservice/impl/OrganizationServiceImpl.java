package com.anycall.serviceorder.proxysservice.impl;

import com.anycall.serviceorder.proxysservice.OrganizationService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrganizationServiceImpl implements OrganizationService {

    @Override
    public List<Long> getMemberOrgTreeId(Long memberId) {
        return null;
    }
}
