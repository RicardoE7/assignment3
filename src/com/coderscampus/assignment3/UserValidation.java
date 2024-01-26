package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserValidation {
private String username;
private String password;

public String compareInputToData (User[] users) {
	String output = "";
	Scanner scanner = new Scanner(System.in);
	String inputUsername = "";
	String inputPassword = "";
	int counter = 1;
	int i = 0;
	
	while (i <= 4) {
		
		while (!(users[i].getUsername().equalsIgnoreCase(inputUsername)) && !(users[i].getPassword().equals(inputPassword))) {
			System.out.println("Please Input Your Username:");
			inputUsername = scanner.nextLine();
			this.username = inputUsername;
		
			System.out.println("Please Input Your Password:");
			inputPassword = scanner.nextLine();
			this.password = inputPassword;
			
			for (int j = 0; j < 4; j++) {
				if ((users[j].getUsername().equalsIgnoreCase(inputUsername)) && (users[j].getPassword().equals(inputPassword))){
					output = "Welcome " + users[j].getName();
					System.out.println(output);
					return output;
				}
				else if (counter == 5)
				{
					output = "Too many failed login attempts, you are now locked out.";
					System.out.println(output);
					System.exit(0);
				}
				
					output = "Invalid login, please try again.";
					
			}
			
			counter++;
			System.out.println(output);
		}
		
		
	}
	return output;
}
}
