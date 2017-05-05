package com.scully.servicesImpl;

import com.scully.services.RecruitmentService;

import java.util.Random;

public class ReferralRecruitmentServiceImpl implements RecruitmentService{

    @Override
    public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitment) {
        Random random = new Random();
        return "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitment)
                + " employees by referrals by current employees";
    }
}
