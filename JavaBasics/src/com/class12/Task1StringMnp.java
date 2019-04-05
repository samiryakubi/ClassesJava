package com.class12;

import java.util.Scanner;

public class Task1StringMnp {

	public static void main(String[] args) {
			/*
			 * Accept user name, password and confirm password and check following requirements:
			*User name and Password cannot be  empty, if so→ message=”User name and Password cannot be empty”.
			*Password should be minimum 8 characters, if less → message=”Password is too short”.
			*Password cannot contain user name if so, → message=”Password cannot contain user name”.
			*Password should match confirmed password, if not  → message “Passwords do not match”.
			*Only after all requirements met → message “Your user name and password has been created”
			*/
		Scanner scan;
		String userName, password, confirmedPassword, message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword=scan.nextLine();
		
		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
			if(password.length()>8) {//2 checkpoint
				if (!password.contains(userName)) {//3 checkpoint
					if (password.equals(confirmedPassword)) {//4 checkpoint
						message="Your username and password has been created";
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
	}
}