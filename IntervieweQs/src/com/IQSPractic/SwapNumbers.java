package com.IQSPractic;

public class SwapNumbers {

	public static void main(String[] args) {

		/*
		 * Writeaprogramtoswap2numberswithoutatemporaryvariable?Swap2stringswithout a
		 * temporary variable?
		 */

		int a = 10;
		int b = 20;

		// 1st way with temp variable
		//
//				int t;
//				
//				t=a;
//				a=b;
//				b=t;
		// 2nd way without the 3rd variable

//				a = a + b; // 30
//				b = a - b; // 10
//				a = a - b;

		// 3rd way using artimathics

		a = a * b; // 200
		b = a / b; // 10
		a = a / b;
		System.out.println("--------Number Swap---------");
		System.out.println(a);
		System.out.println(b);

		System.out.println("-------------String Swawp---------");

		String x = "Hello";
		String y = "World";

		x = x + y;
		y = x.substring(0, (x).length() - y.length());
		x = x.substring(y.length());

		System.out.println(x);
		System.out.println(y);

	}

}