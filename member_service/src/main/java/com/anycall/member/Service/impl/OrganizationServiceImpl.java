package com.anycall.member.Service.impl;


import com.anycall.base.model.account.Organization;
import com.anycall.base.model.account.vo.OrganizationVo;
import com.anycall.member.Service.OrganizationService;
import com.anycall.member.mapper.member.OrganizationMapper;
import com.anycall.member.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/5/30.
 * Copyright © 2014-2016 ants-city.com
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationMapper organizationMapper;
    @Override
    @Cacheable
    public List<Organization> findAllByRoot(Long rootId) {
        List<Organization> organizations=new ArrayList<>();
        Organization org=organizationMapper.findById(rootId);
        if(org!=null){
            organizations.add(org);
        }
        organizations.addAll(this.findChildren(rootId));

        return organizations;
    }

    @Override
    @Cacheable
    public Long findRootOrgId(Long orgId) {
        Organization org=organizationMapper.findById(orgId);
        if (org!=null){
            if(Objects.equals(org.getParentId(),0L))
                return org.getId();
            return this.findRootOrgId(org.getParentId());
        }
        return 0L;
    }
    private List<Organization> findChildren(Long parentId){
        List<Organization> organizations=new ArrayList<>();
        List<OrganizationVo>  children= organizationMapper.findByParentId(parentId);

        for (OrganizationVo child : children){
            Organization org=new Organization();
            BeanUtil.copyProperties(child,org);

            organizations.add(org);
            organizations.addAll(findChildren(org.getId()));
        }

        return organizations;
    }

    @Override
    @Cacheable
    public List<Organization> findByOrgName(String orgName) {
        return organizationMapper.findByOrgName(orgName);
    }


}
