package com.parthu.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.parthu.binding.CustomerAddress;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception {

		File f = new File("customer.json");

		ObjectMapper mapper = new ObjectMapper();

		CustomerAddress c = mapper.readValue(f, CustomerAddress.class);

		System.out.println(c);

	}
} 
