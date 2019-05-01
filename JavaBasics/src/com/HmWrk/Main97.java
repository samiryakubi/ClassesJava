package com.HmWrk;

public class Main97 {
		public static void main(String[] args) {
			  
			Car c1 = new Car("Toyota","Prius",4,120,30000);
			Car c2 = new Car("Toyota","Prius",120,30000);
			Car c3 = new Car(4,120,30000);
			Car c4 = new Car("Toyota","Prius",4);

			System.out. println(c1.make + " " + c1.model + " "+ c1.numberOfDoors +" "+ c1.topSpeed + " " + c1.price);
			System.out. println(c2.make + " " + c2.model + " "+ c2.numberOfDoors +" "+ c2.topSpeed + " " + c2.price);
			System.out. println(c3.make + " " + c3.model + " "+ c3.numberOfDoors +" "+ c3.topSpeed + " " + c3.price);
			System.out. println(c4.make + " " + c4.model + " "+ c4.numberOfDoors + " "+c4.topSpeed + " " + c4.price);
					
				}
			}