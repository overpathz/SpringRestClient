package com.overpathz.spring.rest;

import com.overpathz.spring.rest.configuration.MyConfig;
import com.overpathz.spring.rest.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        Employee getEmployee = communication.getEmployee(4);
        System.out.println(getEmployee);
    }
}
