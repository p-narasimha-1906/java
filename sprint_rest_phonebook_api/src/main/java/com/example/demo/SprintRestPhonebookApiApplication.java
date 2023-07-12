package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jparepository.PhoneBookJpaRepository;

@SpringBootApplication
public class SprintRestPhonebookApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SprintRestPhonebookApiApplication.class, args);
		
	}

}
