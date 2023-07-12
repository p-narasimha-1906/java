package com.example.demo.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestController {
	@GetMapping("/")
	public String getMsg()
	{
		return "Welcome to security";
	}
	@GetMapping("/book")
	public String book()
	{
		return "Book ticket";
	}
	@GetMapping("/transfer")
	public String amoutTransfer()
	{
		return "Transfer amount";
	}
	@GetMapping("/about")
	public String aboutAccount()
	{
		return "About me";
	}
}
