package com.example.demo.Rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user;

@RestController
public class RedisController {
 private HashOperations<String,Integer,user> opsForHash=null;
 
 public RedisController(RedisTemplate<String, user> rt) {
		this.opsForHash = rt.opsForHash();
	}

	@PostMapping("/country")
	public String addCountry(@RequestBody user use) {
		opsForHash.put("COUNTRIES",use.getSno(),use);
		return "Country Added";
	}
//here COUNTRIES is a table name.
	
	
	@GetMapping("/countries")
	public Map<Integer,user> getCountries() {
		Map<Integer,user> entries = opsForHash.entries("COUNTRIES");
		Collection<user> values = entries.values();
		return entries;
	}

 
 
}
