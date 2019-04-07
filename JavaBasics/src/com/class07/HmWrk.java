package com.class07;

import java.util.Scanner;

public class HmWrk {

	public static void main(String[] args) {
		  /*
		  * Ask user to pay for a soda
          *keep asking user to pay for soda until entered price is not equal to 1.99
          *after user got a write amount print "Please enjoy your soda"
          */
		
		double SodaPrice = 1.99;
		Scanner userInput = new Scanner (System.in);
		
		do {
			System.out.println("Please pay for soda");
			SodaPrice =userInput.nextDouble();
		}while(SodaPrice !=1.99);
		     System.out.println("Please Enjoy your soda");
	}

}
