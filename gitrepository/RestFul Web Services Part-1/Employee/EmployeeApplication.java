package com.employee.Employee;

import com.employee.Employee.Model.Employee;
import com.employee.Employee.Repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {
	public static void main(String[] args) {

		SpringApplication.run(EmployeeApplication.class, args);
	}
}
