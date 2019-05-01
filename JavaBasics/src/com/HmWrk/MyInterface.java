package com.HmWrk;

public interface MyInterface {

	void method1();
	void method2();
	
}
class Main333 implements MyInterface{
 public static void main(String [] args) {
	 
	 MyInterface method = new Main333();
	 method.method1();
	 method.method2();
 }
	@Override
	public void method1() {
		System.out.println("implementation of method1");
	}
	@Override
	public void method2() {
		System.out.println("implementation of method2");	
	}
}