package com.class13;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create  a string and print it in reverse
		 * order (Sunday -yadanuS)
		 */

		
		String str ="Sunday";
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
