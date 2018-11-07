package com.apap.tutorial8.service;

import com.apap.tutorial8.model.UserRoleModel;

public interface UserRoleService {
	
	UserRoleModel addUser(UserRoleModel user);
	public String encrypt(String password);
	UserRoleModel getUser(String name);
	boolean isMatch(String rawPassword, String encodedPassword);
	

}
