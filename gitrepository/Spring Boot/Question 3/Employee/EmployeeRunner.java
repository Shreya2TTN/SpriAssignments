package com.spring_boot.spring_boot_demo.Employee;

import com.spring_boot.spring_boot_demo.Employee.EmployeeRepository.EmployeeRepository;
import com.spring_boot.spring_boot_demo.Employee.EmployeeTable.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@SpringBootApplication
@Component
public class EmployeeRunner implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        employeeRepository.save(new EmployeeModel("Shruti","Devloper"));
        employeeRepository.save(new EmployeeModel("Shryansh","Devloper"));
        employeeRepository.save(new EmployeeModel("Simran","Devloper"));
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeRunner.class,args);
    }

}
