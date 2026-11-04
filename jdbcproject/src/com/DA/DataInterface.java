package com.DA;

import com.model.Users;

public interface DataInterface {
	public void LoginUser(String username,String pass);
	public void insertUser(Users u);
	public void selectUser();
	public void updateUser(int id,Users u);
	
}
