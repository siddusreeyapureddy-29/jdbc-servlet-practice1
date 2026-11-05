package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.vcube.model.StudentModel;

public class StudentDAO implements StudentInterf {
	Connection con;
	String status="fail";
	public String insertStudent(StudentModel sm) {
		try {
			System.out.println("DAO started");

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver loaded");

	        con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/college",
	                "root",
	                "root"
	        );
	        System.out.println("Database connected");

	        PreparedStatement ps = con.prepareStatement(
	                "insert into students values(?,?,?,?,?,?)"
	        );

	        System.out.println("PreparedStatement created");

	        ps.setString(1, sm.getUsername());
	        ps.setString(2, sm.getEmail());
	        ps.setString(3, sm.getMobilenumber());
	        ps.setString(4, sm.getGender());
	        ps.setString(5, sm.getCourse());
	        ps.setString(6, sm.getCity());

	        System.out.println("Values set");

	        int n = ps.executeUpdate();

	        System.out.println("Rows inserted: " + n);

	        if (n > 0) {
	            status = "success";
	        }

	    } catch (Exception e) {
	        System.out.println("DATABASE ERROR");
	        e.printStackTrace();
	    }

	    return status;
}
}
