package com.example.demo.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PhoneBookData;
import com.example.demo.jparepository.PhoneBookJpaRepository;
import com.example.demo.service.PhoneBookServiceInterface;

import antlr.collections.List;

@RestController
public class PhoneRest {
	@Autowired
	private PhoneBookServiceInterface repo;

	@PostMapping("/insert")
	public ResponseEntity<PhoneBookData> insertData(@RequestBody PhoneBookData pbd) {
		PhoneBookData data = repo.insert(pbd);
		return new ResponseEntity<>(data, HttpStatus.CREATED);
	}
	@GetMapping("/getData")
	public java.util.List<PhoneBookData> getData() {
		java.util.List<PhoneBookData> pbd=repo.getData();
		return pbd;
	}

	@GetMapping("/delete/{i}")
	public void deleteData(@PathVariable Integer i) {
		repo.deleteData(i);

	}
	@GetMapping("/update/{i}")
	public PhoneBookData updateData(@PathVariable Integer i) {
		PhoneBookData p=repo.update(i);
		return p;
	}

}
