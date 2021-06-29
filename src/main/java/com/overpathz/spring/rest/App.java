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


        System.out.println("All employees:");
        List<Employee> employees = communication.getAllEmployees();
        System.out.println(employees + "\n");

        System.out.println("\nGetting one employee:");
        Employee employee = communication.getEmployee(3);
        System.out.println(employee + "\n");

        System.out.println("\nAdding the employee:");
        Employee addEmployee = new Employee("Dmytro", "Orkestr", "IT", 550);
        communication.saveEmployee(addEmployee);

        System.out.println("\nDelete the employee:");
        communication.deleteEmployee(3);

        // if the employee does not have the id, he will be saved to the database.
        // Otherwise, his data will be updated
        System.out.println("\nUpdate the employee:");
        Employee updateEmployeeId5 = new Employee("Jessica", "London", "Marketing", 1245);
        updateEmployeeId5.setId(5);
        communication.saveEmployee(updateEmployeeId5);
    }
}
