package com.coderscampus.assignment3;

public class User {
private String username;
private String password;
private String name;

public void setUser(String username, String password, String name) {
	this.username = username;
	this.password = password;
	this.name = name;
}

public String getName() {
	return name;
}
public String getPassword() {
	return password;
}
public String getUsername() {
	return username;
}

}
