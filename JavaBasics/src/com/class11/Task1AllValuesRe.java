package com.class11;

public class Task1AllValuesRe {

	public static void main(String[] args) {
		/*
		 *  Create an array of cars :
		 *  American , German ,Italian 
		 *  Retrieve all the values from the array
		 */
        
	        String[][] cars= {
	                 {"Mastang","Ford","GMC","Chevi"},
	                 {"BMW","MB","Audi"},
	                 {"KIA","Hyundai","Daewoo","SsangYong"},
	                 {"Alfa Romeo","Ferrari","Lamborghini","Maserati"},
	                };
	        for (int a=0;a<cars.length;a++) {
	            for(int b=0;b<cars[a].length;b++) {
	                System.out.println(cars[a][b]+" the cars");
	            }
	        }
	    }
	}
