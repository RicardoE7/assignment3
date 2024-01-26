package com.coderscampus.assignment3;

public class UserService {
	public User createUser(String[] userInfo) {
		User user = new User();
		user.setUser(userInfo[0], userInfo[1], userInfo[2]);
		return user;
	}
	
	public String[] parseText(String input) {
		String[] stringArray = input.split(",");
		return stringArray;
	}
}
