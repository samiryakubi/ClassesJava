package com.HmWrk;

import java.util.Scanner;

public class HwWrk {

	public static void main(String[] args) {
		int age = 0;
		   String status = " ";

		   Scanner input = new Scanner(System.in);
		   System.out.println("enter the age of the Child");
		   age = input.nextInt();


		   switch (age){

		   case 1:
		     System.out.println("You can Crawl");
		     break;

		   case 2:
		     System.out.println("You can Talk");
		     break;

		   case 3:
		     System.out.println(" You can Dance");
		     break;

		   case 4:
		     System.out.println(" You can get Trouble");
		     break;

		   default:
		   status = "Invalid";
		   System.out.println("I don't know how old you are");
		 }

		 }
		}