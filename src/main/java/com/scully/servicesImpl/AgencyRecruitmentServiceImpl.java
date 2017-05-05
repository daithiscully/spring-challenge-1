package com.scully.servicesImpl;

import com.scully.services.RecruitmentService;

import java.util.Random;

public class AgencyRecruitmentServiceImpl implements RecruitmentService{


    @Override
    public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitment) {
        Random random = new Random();
        return "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitment)
                + " employees using various hiring agencies";
    }
}
