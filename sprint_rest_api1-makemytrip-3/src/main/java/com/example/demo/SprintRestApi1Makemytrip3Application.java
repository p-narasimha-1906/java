package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.binding.Ticket;

@SpringBootApplication
public class SprintRestApi1Makemytrip3Application {

	public static void main(String[] args) {
		SpringApplication.run(SprintRestApi1Makemytrip3Application.class, args);
		WebClient web =	WebClient.create();
		System.out.println("request start");
		web.get()
		   .uri("http://localhost:8080/getData/{k}",6)
		   .retrieve()
		   .bodyToMono(Ticket.class)
		   .subscribe(SprintRestApi1Makemytrip3Application::handleResponse);
		
		System.out.println("request end");
	}
	public static void handleResponse(Ticket t)
	{
		System.out.println();
	}
}
