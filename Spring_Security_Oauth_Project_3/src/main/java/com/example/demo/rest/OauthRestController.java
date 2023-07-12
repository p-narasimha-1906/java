package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthRestController {
	@GetMapping("/")
	public String getData()
	{
		return "welcome to Oauth";
	}

}
