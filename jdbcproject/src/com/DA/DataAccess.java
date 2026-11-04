package com.DA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Users;
import com.utility.DBConnection;

public class DataAccess implements DataInterface {
	Connection con=null;
	public void LoginUser(String username,String pass) {
		try {
		DBConnection db=new DBConnection();
		con=db.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from users where username=? and pass=?");
		ps.setString(1, username);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Invalid credentials");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void insertUser(Users u) {
		try {
			DBConnection db=new DBConnection();
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2,u.getUsername());
			ps.setString(3,u.getPass());
			int n=ps.executeUpdate();
			if(n>0) {
				System.out.println(n+ "rows inserted");
			}else {
				System.out.println("rows not inserted there should be an error check again");
			}
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}
	public void selectUser() {
		try {
			DBConnection db=new DBConnection();
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from users");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	public void updateUser(int id, Users u) {
		try {
			DBConnection db=new DBConnection();
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement("Update users set ");
			ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
