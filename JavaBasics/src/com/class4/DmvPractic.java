package com.class4;

import java.util.Scanner;

public class DmvPractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner userInput = new Scanner (System.in);
		
		
		System.out.println("How old are you");
		age= userInput.nextInt();
		
        if (age>18) {
        	System.out.println("You Will be issued Drive L");
        }else {
        	System.out.println("You will be issued learner Permit your still a kid lol");
        }
	}

}
