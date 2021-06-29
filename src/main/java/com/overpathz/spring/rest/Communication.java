package com.overpathz.spring.rest;

import com.overpathz.spring.rest.entity.BankCurrency;
import com.overpathz.spring.rest.entity.Employee;
import com.overpathz.spring.rest.entity.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.Collections;
import java.util.List;

@Component("communication")
public class Communication {

    private final String URL = "http://localhost:8080/api/employees/";

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Employee>>() {});

        List<Employee> employees = responseEntity.getBody();

        return responseEntity.getBody();
    }

    public Employee getEmployee(int id) {
        Employee employee = restTemplate.getForObject(URL + "/" + id, Employee.class);
        return employee;
    }

    public void saveEmployee(Employee employee) {
        if (employee.getId() == null) {
            ResponseEntity<Employee> responseEntity = restTemplate.postForEntity(URL, employee, Employee.class);
            System.out.println("New employee was added to database!");
            System.out.println(responseEntity.getBody());
        }
        else {
            restTemplate.put(URL, employee);
            System.out.println("Employee with id " + employee.getId() + " was updated!");
        }
    }

    public void deleteEmployee(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("Employee with ID " + id + " was deleted from database.");
    }
}
