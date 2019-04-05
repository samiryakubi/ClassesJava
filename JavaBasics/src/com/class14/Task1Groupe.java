package com.class14;

public class Task1Groupe {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? 
		//Swap  2 strings without a temporary variable?
		
		int x = 10;
	       int y = 20;
	       System.out.println("Before swap:");
	       System.out.println("x value: "+x);
	       System.out.println("y value: "+y);
	       x = x+y;
	       y=x-y;
	       x=x-y;
	       System.out.println("After swap:");
	       System.out.println("x value: "+x);
	       System.out.println("y value: "+y);
	   }
	}