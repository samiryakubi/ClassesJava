package com.class18;

public class Pyrmaid {

	public static void main(String[] args) {
		// i want to print pattern 
		/*
		 *      **
		 *       ***
		 *        ****
		 */
		
         for (int i=0; i<4; i++) {
        	 for (int y=0; y<=i; y++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
