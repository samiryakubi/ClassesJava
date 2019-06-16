package com.HmWrk;

import java.util.HashSet;

public class Hmwrk157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet<String> hset = new HashSet<String>();
		
		   hset.add("first");
	       hset.add("second");
	       hset.add("third");
	       hset.add("fourth");
	       hset.add("fifth");
	       
	       System.out.println(hset);
	      hset.remove("second");
	       System.out.println(hset);
	       hset.removeAll(hset);
	       System.out.println(hset);
	}

}
