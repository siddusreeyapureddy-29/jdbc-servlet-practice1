package com.DA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.CollegeStud;
import com.utility.DBConnection;

public class Student implements StudInterf {
	static DBConnection db = new DBConnection();
	static Connection con = db.getConnection();

	public void createDatabase() {
		try {
			PreparedStatement ps=con.prepareStatement("create database if not exists college");
			ps.executeUpdate();
			System.out.println("Database created successfully");
			ps.executeUpdate("use college");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void createTable() {
		String create_table="create table if not exists students("+
							"student_id int primary key,"+
							"student_name varchar(30),"+
							"course varchar(10),"+
							"marks double"+")";
		try {
			PreparedStatement ps=con.prepareStatement(create_table);
			ps.executeUpdate();
			System.out.println("Table created successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertStudents(CollegeStud c) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?,?)");
			ps.setInt(1,c.getStudent_id());
			ps.setString(2, c.getStudent_name());
			ps.setString(3, c.getCourse());
			ps.setDouble(4, c.getMarks());
			ps.executeUpdate();
			System.out.println("one row inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void displayAll(CollegeStud c) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from students");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
