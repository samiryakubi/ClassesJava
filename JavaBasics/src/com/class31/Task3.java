package com.class31;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		//Create an arrayList of drinks. 
		//If any drink has letter “a” or “e” replace it with water.
		
		ArrayList<String> drinks = new ArrayList();

		drinks.add("cola");
		drinks.add("beer");
		drinks.add("moonshine");
		drinks.add("Watani");
		
		for (int a=0; a<drinks.size();a++) {
			String drink=drinks.get(a);
			if(drink.contains("a") || drink.contains("e")) {
				drinks.set(a, "water");
			}
		}
		System.out.println(drinks);
	}

}
