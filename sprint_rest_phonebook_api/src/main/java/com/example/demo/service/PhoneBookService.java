package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PhoneBookData;
import com.example.demo.jparepository.PhoneBookJpaRepository;
@Service
public class PhoneBookService implements PhoneBookServiceInterface{
	@Autowired
	private PhoneBookJpaRepository repo;
	@Override
	public PhoneBookData insert(PhoneBookData pbd) {
		repo.save(pbd);
		Optional<PhoneBookData> p=repo.findById(pbd.getId());
		PhoneBookData data=p.get();
		return data;
	}

	@Override
	public List<PhoneBookData> getData() {
		java.util.List<PhoneBookData> pbd = repo.findAll();
		return pbd;
	}

	@Override
	public void deleteData(Integer phid) {
		repo.deleteById(phid);
	}

	@Override
	public PhoneBookData update(Integer phid) {
		// TODO Auto-generated method stub
		Optional<PhoneBookData> p=repo.findById(phid);
		PhoneBookData data=p.get();
		return data;
	}
	

}
