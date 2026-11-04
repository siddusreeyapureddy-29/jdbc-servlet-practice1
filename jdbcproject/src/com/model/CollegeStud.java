package com.model;

public class CollegeStud {
	private int student_id;
	private String student_name;
	private String course;
	private double marks;
	public CollegeStud(){
		
	}
	public CollegeStud(int student_id, String student_name, String course, double marks) {
		this.student_id = student_id;
		this.student_name = student_name;
		this.course = course;
		this.marks = marks;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String toString() {
		return this.student_id+":"+this.student_name+":"+this.course+":"+this.marks;	}
	
	

}
