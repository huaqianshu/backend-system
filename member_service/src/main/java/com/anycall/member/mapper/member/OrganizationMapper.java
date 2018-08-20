package com.anycall.member.mapper.member;


import com.anycall.base.model.account.Organization;
import com.anycall.base.model.account.vo.OrganizationVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2016/5/30.
 */
@Mapper
public interface OrganizationMapper  {
    void deleteByParentId(Long parentId);
    List<Organization> findByOrgName(String orgName);

    List<OrganizationVo> findByParentId(Long parentId);

    List<Organization> findAll();

    Organization findById(Long orgId);

    Organization findOne(Organization organizationdb);
}
