package com.main;

import java.util.Scanner;

import com.DA.DataAccess;
import com.model.Users;

public class UserDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter username:");
//		String user=sc.next();
//		System.out.println("enter password;");
//		String password=sc.next();
		DataAccess da=new DataAccess();
//		da.LoginUser(user,password);
//		da.insertUser(4,"anwija","anwija@456");
		Users u=new Users();
		u.setId(7);
		u.setUsername("nidhi");
		u.setPass("nidhi@908");
		da.insertUser(u);
//		da.selectUser();
		
		sc.close();
	}

}
