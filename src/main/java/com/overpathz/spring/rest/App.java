package com.overpathz.spring.rest;

import com.overpathz.spring.rest.configuration.MyConfig;
import com.overpathz.spring.rest.entity.BankCurrency;
import com.overpathz.spring.rest.entity.Employee;
import com.overpathz.spring.rest.entity.PersonalData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        communication.deleteEmployee(6);
    }
}
