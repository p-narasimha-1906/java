package com.example.demo.entity;
public class PhoneBookData{

	private Integer Id;
	private String name;
	private Long number;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "PhoneBook [Id=" + Id + ", name=" + name + ", number=" + number + "]";
	}

}
