package com.class14;

public class Task2Groupe {

	public static void main(String[] args) {
		// .Write a java program to find the second largest number in the array? 
		//Maximum and minimum number in the array?
		
		int arr[] = { 1,40,30,4,5};
        int largest = arr[0];
        int secondLargest = arr[0];
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
            if(min > arr[i] ) {
                min = arr[i];
            }
        }
        System.out.println("Min number is: "+min);
        System.out.println("Largest number is: "+ largest);
        System.out.println("Second largest number is:" + secondLargest);
      
	   }
	}