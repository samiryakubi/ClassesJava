package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task3 {
	
	//	Create a map of countries with its capital. 
	//	Print all keys and values from a country map using for each loop and iterator.
	//	Print all values from a country map using for each loop and iterator.
	
	public static void main(String[] args) {
		Map <String, String> countryCapital=new HashMap<>();
		countryCapital.put("Afghanistan", "Kabul");
		countryCapital.put("United States", "Washington");
		countryCapital.put("Uzbekistan", "Toshkent");
		countryCapital.put("Spaind", "Madrid");
		countryCapital.put("Pakistan", "IslamAbad");
		
		Set<String> keys=countryCapital.keySet();
		System.out.println("     Using for each loop   ");
		for (String key:keys) {
			System.out.println(key+":"+countryCapital.get(key));
		}
		System.out.println();
		System.out.println("    Using Iterator   ");
		Iterator<String> keysIt=keys.iterator();
		while (keysIt.hasNext()) {
			String key=keysIt.next();
			System.out.println(key+":"+countryCapital.get(key));
		}
	}
}