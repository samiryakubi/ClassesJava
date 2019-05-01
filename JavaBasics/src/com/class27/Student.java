package com.class27;

public class Student {

//	Write program as a student class that has instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student by the displayInfo method.
	String name;
	String address;
	Student (){
		name= "zaki";
		address= "Albany NY";
	}
  void displayInfo() {
	  System.out.println("Student Name  "+name+" "+"and his address is  "+" "+address);
  }
  
  public static void main(String []arges) {
	  Student stu = new Student();
	  stu.displayInfo();
}
}