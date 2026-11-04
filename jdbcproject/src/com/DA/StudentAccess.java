package com.DA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Student;
import com.utility.DBConnection;

public class StudentAccess implements Interface1 {
	Connection con=null;
	public void insertstudent(Student s) {
		try {
		DBConnection d=new DBConnection();
		con=d.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getBranch());
		int n=ps.executeUpdate();
		if(n>0) {
			System.out.println(n+"rows inserted");
		}
		else {
			System.out.println("rows not inserted!!!please check again!!");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	
	public void selectstudent(Student s) {
		try {
			DBConnection d=new DBConnection();
			con=d.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}


	public void updateStudent(int id,Student s) {
		try {
			DBConnection d=new DBConnection();
			con=d.getConnection();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
