package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserLoginApplication {

public static void main(String[] args) throws IOException {
		
		User[] users = new User[4];
		UserValidation compare = new UserValidation();

		UserService userService = new UserService();
		
		BufferedReader fileReader = null;
		try {	
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			String line = "";	
			
			String[] userInfo = new String[3];
			for (int i = 0; i < 4; i++) {
					line = fileReader.readLine();
					userInfo = userService.parseText(line);
					users[i] = userService.createUser(userInfo);
				}
		} 
		finally {
			System.out.println("Closing file reader");
				fileReader.close();
		}
		
		compare.compareInputToData(users);
}
}
