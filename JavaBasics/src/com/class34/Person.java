package com.class34;
//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map to store personId and a Person Object. Print each object details.
public class Person {

	public String name;
	public String lastName;
	public int salary;
	public int age;
	
	public Person(String name , String lastName, int age ,int salary) {
		this.name = name;
		this.lastName= lastName;
		this.salary= salary;
		this.age=age;
	}
	public void personInfo() {
		System.out.print("Name is"+" "+name+" "+"Last Name is"+" "+lastName+" "+"age is"+age+" "+"salary is"+" "+salary);
	}
}
