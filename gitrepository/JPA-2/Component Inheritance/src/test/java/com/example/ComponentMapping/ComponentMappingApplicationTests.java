package com.example.ComponentMapping;

import com.example.ComponentMapping.Entity.Employee;
import com.example.ComponentMapping.Entity.Salary;
import com.example.ComponentMapping.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentMappingApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void testComponentMapping(){
		Employee employee=new Employee();
		employee.setFirstName("Shruti");
		employee.setLastName("Jain");
		employee.setAge(23);
		Salary salary=new Salary();
		salary.setBasicSalary(34355F);
		salary.setBonusSalary(35343F);
		salary.setTaxAmount(3535F);
		salary.setSpecialAllowanceSalary(34534F);
		employee.setSalary(salary);
		employeeRepository.save(employee);
	}

}
