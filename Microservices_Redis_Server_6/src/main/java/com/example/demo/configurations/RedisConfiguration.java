package com.example.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.user;

@Configuration
public class RedisConfiguration {
	@Bean
	public JedisConnectionFactory  jedisConnection()
	{
		JedisConnectionFactory jcf= new JedisConnectionFactory();
	
		return jcf;
	}
	@Bean
	public RedisTemplate<String, user> redisTemplate()
	{
		RedisTemplate<String, user> rt=new RedisTemplate<>();
		rt.setConnectionFactory(jedisConnection());
		return rt;
	}
	

}
