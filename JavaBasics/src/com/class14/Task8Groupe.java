package com.class14;

public class Task8Groupe {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.


		int a = 0, b = 1, x, y = 10;
		
		System.out.print(a+" "+b);
		
		for(int i = 2; i < y; ++i) {
			
			x = a+b;
			System.out.print(" "+x);
			a = b;
			b = x;
		}
	  }
	}
