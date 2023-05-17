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
public class CustomerRestController {
	
	private Map<Integer, Customer> dataMap=new HashMap<>();
	
	@PostMapping("/customer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		dataMap.put(customer.getId(), customer);
		System.out.println(customer);
		return new ResponseEntity<String>("customer saved", HttpStatus.CREATED);
	}

}
