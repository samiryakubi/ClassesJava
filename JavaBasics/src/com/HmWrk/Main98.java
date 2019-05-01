package com.HmWrk;

public class Main98 {

	public static void main(String[] args) {
		  
		StoreProduct s1 = new StoreProduct("Eggs",3,"Produce",true,10);
		StoreProduct s2 = new StoreProduct("Paper Towels",2,24);
		StoreProduct s3 = new StoreProduct("Paper Towels",2);
		
		System.out.println(s1.label + " " + s1.price + " " +s1.category +" "+ s1.hasExpiration + " " + s1.stock);
		System.out.println(s2.label + " " + s2.price + " " +s2.category +" " + s2.hasExpiration + " " + s2.stock);
		System.out.println(s3.label + " " + s3.price + " " +s3.category +" " +s3.hasExpiration + " " + s3.stock);
		
		}
	}