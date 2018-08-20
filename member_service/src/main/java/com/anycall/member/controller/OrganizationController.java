package com.anycall.member.controller;

import com.anycall.base.model.account.Organization;
import com.anycall.member.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @GetMapping("/get/memberOrgTreeId/{id}")
    public List<Long> getMemberOrgTreeId(@PathVariable("id") Long id){
        List<Long> orgIds = new ArrayList<>();
        long rootOrgId = organizationService.findRootOrgId(id);
        orgIds = organizationService.findAllByRoot(rootOrgId)
                .stream()
                .map(Organization::getId)
                .collect(Collectors.toList());
        return orgIds;
    }
}

