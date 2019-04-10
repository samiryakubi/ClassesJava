package com.HmWrk;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		
		int birthdayM;
		 String season = "unknow";
		
		System.out.println("Please enter your birthday month number");
		birthdayM = userInput.nextInt();
		
		if(birthdayM == 12 || birthdayM == 1 || birthdayM == 2 ) {
			season = "Winter";	
		}else if (birthdayM == 3 || birthdayM ==4 || birthdayM == 5 ) {
		  season = "Spring";
		}else if ( birthdayM == 6 || birthdayM == 7 || birthdayM == 8) {
			season = "Summer";
		}else if (birthdayM == 9 || birthdayM == 10 || birthdayM == 11) {
			season = "Fall";
		}else {
			System.out.println("Please enter valid moth number");
		}
	System.out.println("You were born in " +season);
}
}