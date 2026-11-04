package com.main;

import com.DA.StudentAccess;
import com.model.Student;

public class StudentDemo {

	public static void main(String[] args) {
		StudentAccess st=new StudentAccess();
		Student s1=new Student();
//		s1.setId(1);
//		s1.setName("siddu");
//		s1.setBranch("cse");
//		s1.setId(2);
//		s1.setName("sai");
//		s1.setBranch("ece");
//		st.insertstudent(s1);
//		st.insertstudent(s1);
//		System.out.println("row inserted successfully");
		st.selectstudent(s1);

	}

}
