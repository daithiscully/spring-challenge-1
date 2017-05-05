package com.scully.servicesImpl;

import com.scully.services.BusinessService;

import java.util.Random;

public class EcommerceServiceImpl implements BusinessService {
    @Override
    public String offerService(String companyName) {
        Random random = new Random();
        return "\nAs an Organization, " + companyName +
                " provides an outstanding Ecommerce platform.\nThe annual income exceeds €" +
                random.nextInt(revenue);
    }
}
