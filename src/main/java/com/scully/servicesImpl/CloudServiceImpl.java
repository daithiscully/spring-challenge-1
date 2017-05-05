package com.scully.servicesImpl;

import com.scully.services.BusinessService;

import java.util.Random;

public class CloudServiceImpl implements BusinessService {
    @Override
    public String offerService(String companyName) {
        Random random = new Random();
        return "\nAs an Organization, " + companyName +
                " offers world class cloud computing infrastructure.\nThe anual income exceeds €" +
                random.nextInt(revenue);
    }
}
