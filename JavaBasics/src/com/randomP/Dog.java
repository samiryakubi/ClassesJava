package com.randomP;

public class Dog {
	 String breed;
	 
	 void bark() {
		 System.out.println(breed+" can bark");
	 }
	 void run() {
		 System.out.println(breed+" can run");
	 }
	 void play() {
		 System.out.println(breed+" can play");
	 }
	    public static void main(String[] args) {
	  
	    Dog dog1=new Dog();
	    
	    dog1.breed="Husky";
	    dog1.bark();
	    dog1.run();
	    dog1.play();
	    
	   Dog dog2 =new Dog();
	   dog2.breed="Bulldog";
	   dog2.bark();
	   dog2.run();
	   dog2.play();
	   
	   Dog dog3 =new Dog();
	   dog3.breed="Labrador";
	   dog3.bark();
	   dog3.run();
	   dog3.play();
	    
	    
	    }
}