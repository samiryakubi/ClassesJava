package com.class17;

public class Task1 {

	public static void main(String[] args) {
		//Create a method that will take 2 parameters as a 
		//numbers and prints which number is larger
		Task1 obj = new Task1();
	    obj.TheLargestNum(500,606);
	    }
	    
	    void TheLargestNum(int a, int b) {
	        if (a>b) {
	            System.out.println(a+" is larger that "+b);
	            
	        } else {
	            System.out.println(b+" is larger than "+a);
	        }
	    }

	}