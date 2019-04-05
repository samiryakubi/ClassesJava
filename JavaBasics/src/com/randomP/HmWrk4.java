package com.randomP;

import java.util.Scanner;

public class HmWrk4 {

	public static void main(String[] args) {
		 
		String carOrigin;
		Scanner carGuy;
		   carGuy= new Scanner (System.in);
		   System.out.println("Please enter your favorit car make");
		   carOrigin =carGuy.nextLine();
		   
		   switch(carOrigin){
		     case "BMW" :
		          carOrigin= "german car";
		       break ;
		     case "Toyota" :
		    	 carOrigin="japanese car";
		       break ;
		     case "Maserati":
		    	 carOrigin = "italian car";
		       break ;
		       default:
		    	   carOrigin = "unknown";
		       break ;
		   }
		      System.out.println("Your favorite car is  "+carOrigin);
		 }
	}

