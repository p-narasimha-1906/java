package com.parthu.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.parthu.binding.Customer;
import com.parthu.binding.CustomerAddress;

public class JavaToJsonConverter {
	
	public static void main(String[] args)throws Exception {
		
	CustomerAddress address=new CustomerAddress();
	address.setCity("Hyd");
	address.setState("TG");
	address.setCountry("India");
	
	Customer customer = new Customer();
	
	customer.setId(101);
	customer.setName("Parthu");
	customer.setEmail("parthu@gmail.com");
	customer.setPhNo(123456234);
	customer.setAddress(address);
	
	ObjectMapper mapper=new ObjectMapper();
	
	mapper.writeValue(new File("customer.json"), customer);
	
	}

}
