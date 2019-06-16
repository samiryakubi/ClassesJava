package com.class36;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an exception : when user it trying to withdraw larger amount that the balance 
		 * throw and exception saying : You Do have enough money ".
		 */
		
		
		withdrawThatMoney(9000);
	}
public static void withdrawThatMoney(int money ) {
	if (money<100) {
		System.out.println("Tak Yo Money ");
	}else {
		throw new ArithmeticException("You ain't got no money you broke bruh!");
	}
   }
}
