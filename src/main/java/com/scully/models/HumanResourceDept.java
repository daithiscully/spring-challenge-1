package com.scully.models;

import com.scully.services.RecruitmentService;

public class HumanResourceDept implements Department{

    private String departmentName;
    private RecruitmentService recruitmentService;
    private Organization organization;

    public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
        this.recruitmentService = recruitmentService;
        this.organization = organization;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String hiringStatus(int numberOfRecruitments) {
        return recruitmentService.recruitEmployees(organization.getCompanyName(), departmentName, numberOfRecruitments);
    }
}
