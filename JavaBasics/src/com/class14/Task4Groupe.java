package com.class14;

public class Task4Groupe {

	public static void main(String[] args) {
		         //4.How to find out the part of the string from a string?
			    // What is substring? Find number of words in string?

			    String str="today is not a good day";
			    
			    String newStr=str.substring(5, 12);
			     System.out.println(newStr);
			    
			    String[] str2=str.split(" ");
			    
			    for (String substring:str2) {
			    System.out.println(substring);
			    
			    }
			    System.out.println("The number of words in string is "+str2.length);
	}

}
