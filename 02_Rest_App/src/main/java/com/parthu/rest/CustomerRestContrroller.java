package com.parthu.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parthu.binding.Customer;

@RestController
public class CustomerRestContrroller {

	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		String s = "Hi, Welcome to user details";
		return new ResponseEntity<String>(s, HttpStatus.CREATED);
	}

	private Map<Integer, Customer> dataMap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody Customer customer) {
		System.out.println(customer);
		dataMap.put(customer.getId(), customer);
		return new ResponseEntity<String>("User saved", HttpStatus.CREATED);
	}
}
