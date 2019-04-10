package com.HmWrk;
import java.util.Scanner;
 
public class HmWrk3 {

	public static void main(String[] args) {
		
		int student = 0;
		String name ;
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("enter the roll numbers of teh Child");
		student = userInput.nextInt();
		
		switch (student) {
		case 101 :
			System.out.println("Student name :Ramesh");
			break;
		case 102 :
			System.out.println("Student name : Mahes");
			break;
		case 103:
			System.out.println("Student name :Mukesh");
			break;
		default:
			name = "invalid";
			System.out.println("Not Found Student name : in Class");
		}
		
			
	}

}
