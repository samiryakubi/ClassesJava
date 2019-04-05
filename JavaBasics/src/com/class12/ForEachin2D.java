package com.class12;

public class ForEachin2D {

	public static void main(String[] args) {
		/*
		 * Create a grocery list : fruits{}
		 * Veggies {}
		 * Dair{}
		 * Retrive all the values using 2 different loops
		 */

		String [][] fruit = {
				{"Apple","Grapes","orange","strawbery"},
				{"cucumber","Tomatos","celery","potato"},
				{"Milk","Cheez","egg","yogart",},		
				};
		for (int i =0; i<fruit.length;i++) {
			for (int j=0; j<fruit[i].length; j++) {
				System.out.print(fruit[i][j]+" ");	
			}
			 System.out.print("--------2ndLoop---------");
		       for (String[] list :fruit) {
		        for(String item:list) {
		        	System.out.println(item);
			       }
 
		       }
          }
	}
}