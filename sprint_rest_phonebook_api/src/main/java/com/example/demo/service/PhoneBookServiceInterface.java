package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.PhoneBookData;
@Service
public interface PhoneBookServiceInterface {
	public PhoneBookData insert(PhoneBookData p);
	public List<PhoneBookData> getData();
	public void deleteData(Integer phid);
	public PhoneBookData update(Integer phid);

}
