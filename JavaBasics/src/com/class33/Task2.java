package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
	//	Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). 
	//Insert 7 entries with duplicate keys and values.
	//	Check how many entries you have?
	//	Update company on a 4th floor
	//	Remove company on the 7th floor
	//	Print your map
	public static void main(String[] args) {
	
		Map<Integer, String > map=new HashMap<>();
		map.put(1, "Facebook");
		map.put(2, "Google");
		map.put(3, "Tinder");
		map.put(4, "BestBuy");
	    map.put(5, "Frys");
	    map.put(6, "CNN");
	    map.put(7, "CNBC");
	    map.put(3, "Tinder");
	    map.put(2, "Google");
	    
	    System.out.println(map.size());
	    map.put(4, "CONS");
	    System.out.println(map);
	    map.remove(7);
	    System.out.println(map);
	}
}
