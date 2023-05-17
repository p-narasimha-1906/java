package com.parthu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parthu.binding.Employee;

@RestController
public class EmployeeRestController {

	@GetMapping(value = "/emp", produces = { "application/json", "application/xml" })
	public Employee getEmp() {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("John");
		emp.setEmail("john@gmail.com");
		emp.setSalary(10000.0);
		return emp;

	}

	@PostMapping(value = "/emp", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addEmp(@RequestBody Employee emp) {

		String msg = "Record saved";

		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}

}
