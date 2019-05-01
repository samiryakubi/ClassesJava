package com.HmWrk;

public class EmployeeTest {


	public static void main(String[] args) {
		Employee e1 = new Employee();
		print(e1);
		Employee e2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
		print(e2);
	}

	static void print(Employee e) {

		System.out.println(e.name + " " + e.lastName + " " + e.employeeId + " " + e.startDate + " " + e.salary);

	}	
}