package com.vcube.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	Connection con;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
