package com.class22;

public class Task {
	 Task(){
		System.out.println("This is first Task");
	}
	public Task(String name){
	        System.out.println("I'm secound type "+name);
	    }
	
	public static void main(String[] args) {
		//Write a program that will have a constructor: 
		//one with parameters and second without any parameters. 
		//Create a separate Test class where you will execute both of the constructors.
		
		Task obj=new Task();
		Task obj1 =new Task("constructor");
		
	}
}
