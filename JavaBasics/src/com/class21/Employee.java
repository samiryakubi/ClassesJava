package com.class21;

public class Employee {
	
	String eID;
	double Salary;
	public static String CEO ="Sumair";

	public static void main(String[] args) {
				//  Create a Class called Employee:
				//  Create three  variables  eID , salary and set the CEO to “Sumair”
				//  Create two objects of the class Employee
				//  Set the value of eID, salary for each of the objects
				//	Print out the eID , salary and  CEO for each of the objects
		
	Employee emp1 = new Employee();
		emp1.eID = "co143";
		emp1.Salary = 90000;
		emp1.getEmployeeInfo();
		
		System.out.println();
		
	Employee emp2= new Employee();
		emp2.eID ="DO143";
		emp2.Salary=11000;
		emp2.getEmployeeInfo();
		
	}
    public void getEmployeeInfo() {
		System.out.println("CEO "+CEO+"\nEmployee ID "+eID+"\nSalary "+Salary);	
	}

}
