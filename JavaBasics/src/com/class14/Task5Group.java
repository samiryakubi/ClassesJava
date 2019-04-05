package com.class14;

public class Task5Group {

	public static void main(String[] args) {
		// Write a java program to reverse String? 
		//Reverse a string word by word?

		String str="today is not a good day";
	      
	       char[] array=str.toCharArray();
	      
	       for (int i=str.length()-1; i>=0; i--)  {
	           System.out.print(array[i]);
	       }
		
	}

}
