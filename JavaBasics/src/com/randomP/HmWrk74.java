package com.randomP;

import java.util.Scanner;

public class HmWrk74 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
           if (language.equalsIgnoreCase("Java")) {
        	   System.out.println("Java is Programing language");
           }else if (language.equalsIgnoreCase("C")) {
        	   System.out.println("C is a procedural programming language");
           }else if(language.equalsIgnoreCase("C++")) {
        	   System.out.println("C++ is a middle-level programming language");
           }else {
        	   System.out.println("Doesn't match any programming language");
           }
	}

}
