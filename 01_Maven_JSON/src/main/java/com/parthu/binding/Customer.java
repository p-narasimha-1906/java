package com.parthu.binding;

public class Customer {
	
	private Integer id;
	private String name;
	private String email;
	private Long phNo;
	
	private CustomerAddress address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(long i) {
		this.phNo = i;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phNo=" + phNo + ", address=" + address
				+ "]";
	}
	
	

}
