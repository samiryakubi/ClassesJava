package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
	// Create an arraylist of cars and retrieve all the values using 4 different ways.

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Toyota");
		cars.add("Hundai");
		cars.add("Ferrari");
		cars.add("Mastang");
		
		System.out.println("### FOR LOOP ###");
		for (int i =0; i<cars.size(); i++) {
		  System.out.println(cars.get(i));
		 
		  
		  System.out.println("### Iterator ###");
		  Iterator<String> it = cars.iterator();
		  System.out.println(it);
		  
		  System.out.println("### advance for loop ###");
		    for (Object car:cars) {
			    System.out.println(car);
	     System.out.println("### while loop ###");
			    
	     while (cars.size()>++i) {
	    	 String car1=cars.get(i);
	    	 System.out.println(car1);
	          }
		  }
		 
       }
	}
}