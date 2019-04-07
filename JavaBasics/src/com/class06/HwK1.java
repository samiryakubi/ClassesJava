package com.class06;

import java.util.Scanner;

public class HwK1 {

	public static void main(String[] args) {
		/*
		 * write a program to fine largest of three double values  using uf else..
		 * if provide by a user ( numbers must be distinct 
		 */
           double num1,num2 ,num3 ;
           
           Scanner scan = new Scanner(System.in);
           
           System.out.println("Please enter 3 distinct double values");
           num1 = scan.nextDouble();
           num2 = scan.nextDouble();
           num3 = scan.nextDouble();
           
           
           if (num1>num2 && num1>num3) {
        	   System.out.println(num1 + "is the largest ");
           }else if (num2>num1 && num2>num3) {
        	   System.out.println(num2 + " is the the largest ");
           }else if (num3 > num1 && num3 > num2) {
        	   System.out.println(num3+ " is the largest");
           }
	}

}
