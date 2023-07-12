package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.FeignInterface.GreetFeignClient;

@RestController
public class WelcomeRestController {
	@Autowired
	private GreetFeignClient gfc;
	@GetMapping("/Welcome")
	public String getMessage()
	{
		/*RestTemplate rt=new RestTemplate();
		ResponseEntity<String> re=  rt.getForEntity("http://localhost:8081/Greet", String.class);
		String s=re.getBody(); */
		
		String s=gfc.invokeGreetApi();
		
		
		return s+"welcome to my home";
	}
	
	
	
	

}
