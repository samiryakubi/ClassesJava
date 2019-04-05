package com.class10;

public class Task1Arrays {

	public static void main(String[] args) {
		/*
		 * 1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array)
		 */
            
		// 1st way
		String [] Store={"A" ,"B","C","D","E","F"};
		System.out.println(Store[1]);
		
		
		//2nd way
		
		String[] Grade =new String[6];
        Grade[0]="A";
        Grade[1]="B";
        Grade[2]="C";
        Grade[3]="D";
        Grade[4]="E";
        Grade[5]="F";
        
        System.out.println(Grade[3]);
	}

}
