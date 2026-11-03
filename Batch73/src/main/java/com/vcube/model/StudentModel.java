package com.vcube.model;

public class StudentModel {
	private String fullname;
	private String email;
	private String password;
	private String confirmpassword;
	public StudentModel(String fullname, String email, String password, String confirmpassword) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public StudentModel() {
		
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "StudentModel [fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	
	
}
