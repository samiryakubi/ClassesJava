package com.HmWrk;

public class Car {
	 
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;

	Car(String makee,
	String modell,
	int numberOfDoorss,
	int topSpeedd,
	double pricee){
	  
	  make = makee;
	  model = modell;
	  numberOfDoors = numberOfDoorss;
	  topSpeed = topSpeedd;
	  price = pricee;
	  
	}

	Car(String makee,
	String modell,
	int topSpeedd,
	double pricee){
	  make =makee;
	  model =modell;
	  topSpeed = topSpeedd;
	  price = pricee;
	  numberOfDoors =4;
	  
	}

	Car(
	int numberOfDoorss,
	int topSpeedd,
	double pricee){
	  
	  make ="unknown";
	  model ="unknown";
	  numberOfDoors = numberOfDoorss;
	  topSpeed = topSpeedd;
	  price = pricee;
	  
	}

	Car(String makee,
	String modell,
	int numberOfDoorss){
	  make = makee;
	  model = modell;
	  numberOfDoors = numberOfDoorss;
	  topSpeed =90;
	  price =0;
	}
	}