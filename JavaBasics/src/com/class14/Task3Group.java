package com.class14;

public class Task3Group {

	public static void main(String[] args) {
		//  Find out how many alpha characters present in a string?
		 String day="It is a 1123wonderful $%?^day";
	        String day1=day.replaceAll("[^a-zA-z]","");
	        String day2=day1.replace("^","");
	        System.out.println(day2.length());

	    }
	}

