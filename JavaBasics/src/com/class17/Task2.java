package com.class17;

public class Task2 {

	public static void main(String[] args) {
		// Create a method that will take a number 
		//and prints whether the number is even or odd.
		Task2 numbers = new Task2();
        numbers.evenNumberOrOddN(101);      
	    }
	    void evenNumberOrOddN(int num) {
	        if(num % 2 ==0) {
	            System.out.println("The number is Even");
	        }else {
	            System.out.println("The number is Odd");
	        }
       }
}