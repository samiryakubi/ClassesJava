package com.HmWrk;

public class PracticArr {

	public static void main(String[] args) {
		//
		
  
		int[] integers = new int[11];
		
		int years = 2010;
		
		for(int index = 9; index <= integers.length; index++) {
			
			integers[index] = years++;
			
			System.out.println(integers[index]);
		}
		
		System.out.println("I am out of loop");
	}
}
