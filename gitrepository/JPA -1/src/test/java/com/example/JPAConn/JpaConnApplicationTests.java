package com.example.JPAConn;

import com.example.JPAConn.EmployeeEntity.Employee;
import com.example.JPAConn.EmployeeRepository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class JpaConnApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test//Creating new Employees
	public void createEmployee(){
		Employee employee=new Employee("Shruti",23,"Delhi");
		employeeRepository.save(employee);
		Employee employee1=new Employee("Riya",34,"Lucknow");
		employeeRepository.save(employee1);
		Employee employee2=new Employee("Charu",23,"Delhi");
		employeeRepository.save(employee2);
		Employee employee3=new Employee("Aakash",23,"Delhi");
		employeeRepository.save(employee3);
	}
	@Test//Reading Data
	public void showEmployee(){
		Employee employee1 = employeeRepository.findById(2).orElse(null);
		System.out.println(employee1.toString());
	}
	@Test//Updating Data
	public void testUpdate(){
		Employee employee=employeeRepository.findById(1).orElse(null);
		if(employee!= null) {
			employee.setName("Shreya");
			employeeRepository.save(employee);
			System.out.println(employee.toString());
		}
	}
	@Test//Deleting Employee
	public void testDelete(){
		employeeRepository.deleteById(1);
	}
	@Test//Counting total no. of employees
	public void testCount(){
		System.out.println(employeeRepository.count());
	}
	@Test//Finding Employee by name
	public void testFindBYName(){
		List<Employee> employee=employeeRepository.findByName("Riya");
		employee.forEach(System.out::println);
	}
	@Test//FInding Employee whose Name starts with A
	public void testFindStartingWithA(){
		List<Employee> employees=employeeRepository.findByNameStartingWith("A");
		employees.forEach(System.out::println);
	}
	@Test//Finding Employee whose age is between 20 and 36
	public void testBetween(){
		List<Employee> employees=employeeRepository.findByAgeBetween(20,36);
		employees.forEach(System.out::println);
	}
	@Test//Applying sorting and paging according to age in descending order
	public void testPageable(){
		Pageable pageable = PageRequest.of(0 , 2 , Sort.Direction.DESC ,"age");
		Page<Employee> results = employeeRepository.findAll(pageable) ;
		results.forEach(System.out::println);
	}
}
