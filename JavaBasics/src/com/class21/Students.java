package com.class21;

public class Students {
     
	public String studentName;
	public  String studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		//Create a Class called Students
		//Create three  variables  studentName , studentID  and  numberOfStudents
		//Create three objects of the Students Class
		//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
		//Print out  total number of students

		Students stud = new Students();
		
		stud.studentName="Zaki";
		stud.studentID= "DOB143";
		numberOfStudents++;
		
		Students stud1 = new Students();
		stud1.studentName="Sam";
		stud1.studentID= "DOC143";
		numberOfStudents++;
		System.out.println("Total numbre of students are  "+numberOfStudents);
	}
    
}
