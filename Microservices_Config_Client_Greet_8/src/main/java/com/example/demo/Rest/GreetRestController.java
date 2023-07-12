package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@Value("${msg}")
	private String s;
	@GetMapping("/Greet")
	public String getMsg()
	{
		return s;
	}

}
