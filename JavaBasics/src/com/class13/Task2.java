package com.class13;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner (System.in);
	        System.out.println( "enter a string");
	        String sut= scan.nextLine();
	        int a=sut.length();
	        char b;
	        if (a>0) {
	        if ((!(a%2==0)) && (a>=3)) {
	            b =sut.charAt((a-1)/2);
	            System.out.println(b);
	            }
	            }
	        }
	}