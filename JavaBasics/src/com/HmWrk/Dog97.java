package com.HmWrk;

public class Dog97 {
	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";
	
	Dog97(String name, String breed, double weight){
	  dogName=name;
		dogWeight=weight;
		dogBreed=breed;
		System.out.println(dogName +" " +dogBreed +" "+dogWeight);
	}
	Dog97(String name,double weight){
    dogName=name;
		dogWeight=weight;
		System.out.println(dogName+" " +dogBreed+" " +dogWeight);
	}
}

