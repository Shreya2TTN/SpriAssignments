package com.example.JPAHibernate;

import com.example.JPAHibernate.EmployeeEntity.Employee;
import com.example.JPAHibernate.EmployeeRepository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class JpaHibernateApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void testCreate(){
		employeeRepository.save(new Employee("Riyansh","Jain",34,12344));
		employeeRepository.save(new Employee("Himani","Bhardwaj",23,224234));
		employeeRepository.save(new Employee("Riya","Bhalla",22,224234));
		employeeRepository.save(new Employee("Shruti","Jain",21,224234));
		employeeRepository.save(new Employee("Prasoon","Singh",23,34534565));
	}
	@Test//Query 1 JPQL
	void testQuery(){
		List<Object[]> partial=employeeRepository.findAllEmployeesPartialData();
		for(Object[] objects:partial){
			System.out.print(objects[0]);
			System.out.println("  "+objects[1]);
		}
	}
	@Test
	@Transactional
	@Rollback(value = false)
	void testDelete(){
		employeeRepository.deleteEmployee(employeeRepository.findMin());
	}
	@Test
	@Transactional
	@Rollback(value = false)
	void testUpdate(){

		employeeRepository.updateEmployee(123342343,employeeRepository.fingAvg());
	}
	@Test
	void testValue(){
		List<Object[]> partial=employeeRepository.findLastNameSingh();
		for(Object[] objects:partial){
			System.out.print(objects[0]);
			System.out.print("  "+objects[1]);
			System.out.println(" "+objects[2]);
		}
	}
	@Test
	@Transactional
	@Rollback(value = false)
	void testDeleteAge(){
		employeeRepository.deleteAge(45);
	}

}
