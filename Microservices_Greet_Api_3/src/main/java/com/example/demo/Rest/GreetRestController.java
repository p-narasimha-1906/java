package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@Autowired
	private Environment env;
	@GetMapping("/Greet")
	public String getMessage()
	{
		String i=env.getProperty("server.port");
		return "hello how r u "+ i;
	}
	
	@GetMapping("/get")
	public String getData()
	{
		String i=env.getProperty("server.port");
		
		return "simha "+ i;
	}

}
