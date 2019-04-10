package com.class18;

public class Application {
	  public static void main(String[] args) {

	        Human person1 = new Human();
	        
	        
	        person1.print();
	        Human.eyeColour = "pink";

	        person1.print();

	        System.out.println(Human.eyeColour);
	        System.out.println(person1.height);
	        System.out.println(person1.weight);
	        System.out.println(person1.gender);

	        Human person2 = new Human();

//	        person2.eyeColour = “Orange”;

	        System.out.println(Human.eyeColour);
	        System.out.println(person2.height);
	        System.out.println(person2.weight);
	        System.out.println(person2.gender);

	        person2.print();

	    }

	}