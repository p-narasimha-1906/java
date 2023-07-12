package com.example.demo.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PhoneBookData;



public interface PhoneBookJpaRepository extends JpaRepository<PhoneBookData, Integer> {
	

}
