package com.class17_2;

public class Nestedloop1 {

	public static void main(String[] args) {
		
		Nestedloop1 num =new Nestedloop1();
		num.printThNum();
 }
	
	void printThNum() {
		 for (int i=0; i<5; i++) {
	            
             for (int y=0; y<3; y++) {
                 
                 System.out.println("I am inner loop"+y);
             }
         
     System.out.println("-------I am outer loop------"+i);
         
     }
	}
 }


