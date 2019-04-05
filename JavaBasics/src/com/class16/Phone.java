package com.class16;

public class Phone {

		String made, model;
		boolean bluetooth, LTE;
		int screen;
    public static void main(String[] args) {
		        //Create a Class “Phone”. Create 3 Objects of it:
    	        //iPhone, Android, Nokia with specific  attributes and behaviours.
		Phone p1=new Phone();
		p1.made="Nokia";
		p1.model="flip2";
		p1.LTE=false;
		p1.bluetooth=false;
		p1.screen=2;

		Phone p2=new Phone();
		p2.made="Aplle";
		p2.model="X";
		p2.LTE=true;
		p2.bluetooth=true;
		p2.screen=4;


		Phone p3=new Phone();
		p3.made="Samsung";
		p3.model="SXXX";
		p3.LTE=true;
		p3.bluetooth=true;
		p3.screen=5;
		    }
		void call() {
		    System.out.println("You can call by your "+model);
		}
		void watchWebinar() {
		    System.out.println("You can watch webinar if you are not in class student");
		}
		void selfie() {
		    System.out.println("You dont have to have a reason to take selfie");
		  }
		}
	
	