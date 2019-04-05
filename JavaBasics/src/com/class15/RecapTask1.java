package com.class15;

public class RecapTask1 {

	public static void main(String[] args) {
		// Task2
		
		
		int a=10;
		int b=20;
		
		a=a+b ;//30
		b=a-b; //30-10=20,
		a=a-b; //30-10=20
		
		System.out.println("The value of a= "+a+" value of b="+b);
		
		String str1="Hello";
		String str2="World";
		
		str1=str1+str2;//HelloWorld-->10
		str2=str1.substring(0, str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());
		
		System.out.println("The value of str1="+str1+" value of str2="+str2);
		
		
		

	}

}
