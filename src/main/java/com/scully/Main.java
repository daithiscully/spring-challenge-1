package com.scully;

import com.scully.models.HumanResourceDept;
import com.scully.models.Organization;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Organization org = (Organization) ctx.getBean("myOrg");

        System.out.println(org.corporateSlogan());

//        System.out.println(org);
//        System.out.println(org.corporateService());

        HumanResourceDept humanResourceDept = (HumanResourceDept) ctx.getBean("myHrdept");
        System.out.println(humanResourceDept.hiringStatus(123));

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
