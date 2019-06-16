package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TaskBestBuy {
	//	Create a map of Best Buy store. Place
	//	item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	//	Print all keys and values from a Best Buy map using EntrySet.
	public static void main(String[] args) {
		Map<String, Integer> bestBuy=new LinkedHashMap<>();
		bestBuy.put("HP Laptop",   89677); 
		bestBuy.put("Printer ",   4578896); 
		bestBuy.put("projector",  8967445);
		bestBuy.put("Airpod",     7698989);
		bestBuy.put("MacBook",    9898998);
       
		
		System.out.println(bestBuy);
		for (Map.Entry<String, Integer> entry:bestBuy.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println("---------iterator---------------");
		Iterator<Map.Entry <String, Integer>> classRoomIterator=bestBuy.entrySet().iterator();
		while(classRoomIterator.hasNext()) {
			Map.Entry<String, Integer> me=classRoomIterator.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}
}
