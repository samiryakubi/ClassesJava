package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test
	public void TestMethodOne() {
		System.out.println("testMehodOne");
	}
	@Test
	
	public void testMethodTwo() {
		System.out.println("testMehodTwo");
	}
    
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	
}
