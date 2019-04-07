package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x=10 ;
		int y =x;
		System.out.println(x+" "+y);

		
		//post increment a++
		
		int a = 299;
		int b =a++;
		System.out.println(a); // 300
		System.out.println(b); //299
		
		// post decrement x--;
		
		int z =10;
		int c= z--;
		System.out.println(z); //9
		System.out.println(c); //10
	}

}
