package com.HmWrk;

public class Main94 {
	 static boolean  bothEven(int num1, int num2) {
	   if (num1% 2 ==0 && num2 %2==0){
		   return true; 
	   }else {
		   return false;
	   }
		
	}
	
	//test case below (don't change):
	public static void main(String[] args){
		System.out.println(bothEven(8,6)); //should be true
		System.out.println(bothEven(5,6)); //should be false
	}
}