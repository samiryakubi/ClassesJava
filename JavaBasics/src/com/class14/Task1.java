package com.class14;

public class Task1 {
	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */
		String sentence= "ilove my car !";
	    String newStr=sentence.replaceAll(" ", "");
	    System.out.println(newStr);
	}
}