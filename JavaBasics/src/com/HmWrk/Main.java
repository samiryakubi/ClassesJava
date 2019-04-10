package com.HmWrk;

public class Main {
   
	String name ,color ;
	int modelYear;
	
	public static void main(String[] args) {
		
		Main car1=new Main ();
		
		car1.color= "Black";
		car1.name ="BMW";
		car1.modelYear=2019;
		
		System.out.println("Car color is "+car1.color+" and car model year is "+car1.modelYear +" and car name is "+car1.name);
        
		//2object
        Main car2=new Main ();
		
		car2.color= "White";
		car2.name ="Toyota";
		car2.modelYear=2018;
		
		System.out.println("Car color is "+car2.color+" and car model year is "+car2.modelYear +" and car name is "+car2.name);

	}

}
