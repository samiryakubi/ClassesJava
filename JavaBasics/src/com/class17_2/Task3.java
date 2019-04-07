package com.class17_2;

public class Task3 {

	public static void main(String[] args) {
		/* 3. Print the following pattern:
		*1
		*12
		*123
		*1234
		*12345
		*/
		
		for (int i=1; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}