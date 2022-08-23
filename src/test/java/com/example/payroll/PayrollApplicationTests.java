package com.example.payroll;

import com.example.payroll.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PayrollApplicationTests {

	@Autowired
	private EmployeeController employeeController;

	@Test
	void contextLoads() {
		assertThat(employeeController).isNotNull();;
	}

}
