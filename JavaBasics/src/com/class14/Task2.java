package com.class14;

public class Task2 {
	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters,
		 *  numbers and special characters. 
		 * Find out how many alpha characters are there in the String
		 */
		   
        String a="Is it saturday! Is it raining! Do we have a Java Class today?";
        
        String[] sentance= a.split("[!?]");
    
        System.out.print(sentance.length);
    
    }
	}
