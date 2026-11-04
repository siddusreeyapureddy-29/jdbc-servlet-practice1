package com.vcube.model;

public class StudentModel {
	private String username;
	private String email;
	private String mobilenumber;
	private String gender;
	private String course;
	private String city;
	public StudentModel() {
		
	}
	
	public StudentModel(String username, String email, String mobilenumber, String gender, String course, String city) {
		super();
		this.username = username;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.course = course;
		this.city = city;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return this.username;
	}
	
}
