package com.parthu.binding;

public class RegistrationForm {

	private String fname;
	private String sname;
	private String email;
	private String pwd;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "RegistrationForm [fname=" + fname + ", sname=" + sname + ", email=" + email + ", pwd=" + pwd + "]";
	}
	
	
}
