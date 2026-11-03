package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.model.StudentModel;
import com.vcube.utility.DBConnection;

public class StudentDAO implements StudentInterface {
	String status="fail";
	DBConnection db=new DBConnection();
	Connection con=db.getConnection();

	public String insertStudents(StudentModel sm) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into student1(fullname,email,password,confirmpassword) values(?,?,?,?)");
			ps.setString(1, sm.getFullname());
			ps.setString(2, sm.getEmail());
			ps.setString(3,sm.getPassword());
			ps.setString(4,sm.getConfirmpassword());
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

	public String selectStudents() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from student1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				status="success";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
