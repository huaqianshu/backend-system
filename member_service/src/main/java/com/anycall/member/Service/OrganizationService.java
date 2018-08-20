package com.anycall.member.Service;

import com.anycall.base.model.account.Organization;

import java.util.List;

/**
 * Created by lujun on 16/5/29.
 * Copyright © 2014-2016 ants-city.com
 */
public interface OrganizationService {


    /**
     * 根据orgName获得Organization
     *
     * @param orgName
     * @return
     */
    List<Organization> findByOrgName(String orgName);

    List<Organization> findAllByRoot(Long rootId);
    /**
     * 查询到本级节点的顶级节点
     *
     * @param orgId
     * @return
     */
    Long findRootOrgId(Long orgId);

}
