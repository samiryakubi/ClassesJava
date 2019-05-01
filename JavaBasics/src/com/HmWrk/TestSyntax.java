package com.HmWrk;

public class TestSyntax {
	public static void main(String[] args)
	{
	  
SyntaxTechnologies s1 = new SyntaxTechnologies();
	SyntaxTechnologies s2 = new SyntaxTechnologies("Syntax",4,"2019", "07/30/2019");

	System.out.println(s1.schoolName + " " + s1.batch + " " + s1.year + " " + s1.lastDayOfClass);
	System.out.println(s2.schoolName + " " + s2.batch + " " + s2.year + " " + s2.lastDayOfClass);

	
	}
}