package com.class33;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Task {
//	How can you remove all duplicates from ArrayList?
//
//			List<String> aList=new ArrayList<String>();
//			        aList.add(“John”);
//			        aList.add(“Jane”);
//			        aList.add(“James”);
//			        aList.add(“Jasmine”);
//			        aList.add(“Jane”);
//			        aList.add(“James”);
	public static void main(String[] args) {
		List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        
        Set<String> hashSet= new HashSet<String>(aList);
        System.out.println(hashSet);
	}
}
