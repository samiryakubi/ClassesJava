package com.class14;

public class Task6Groupe {
public static void main (String[]args) {
	//Write a Java Program to find whether a String is palindrome or not?
 
    String str = "madam";
    String reverse = "";
    
    for (int i=str.length()-1; i>=0; i--) {
        reverse+=str.charAt(i);
    } System.out.println(reverse);
      
    if (reverse.equalsIgnoreCase(str)) {
        System.out.println(str+ " is a Palyndrome");
        } else {
            System.out.println("Not a Palyndrome");
        }
        	
	
  }
}
