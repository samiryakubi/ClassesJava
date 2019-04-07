
package com.class04;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
       String cityName;
       int temp;
       
       Scanner myScanner = new Scanner (System.in);
       System.out.println("PLease Enter your city Name");
       cityName = myScanner.nextLine();
       
       System.out.println("Please Enter the temperature in Fahrenheit");
       temp = myScanner.nextInt();
       // formula (F-32)X 5/9
       
       int covertedTemp = (temp-32)*5/9;
       
       System.out.println("the temperatture in the city " + cityName + "is" + covertedTemp + "C");
       
       
	}
}
