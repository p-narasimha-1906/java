package com.example.demo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Bean
	public SecurityFilterChain filterMethods(HttpSecurity http) throws Exception
	{
		System.out.println("security filter method called....");
		http.authorizeHttpRequests((request)-> request
				.antMatchers("/","/about").permitAll()
				.anyRequest().authenticated()
				
				).formLogin();
		return http.build();
		
		
	}

}
