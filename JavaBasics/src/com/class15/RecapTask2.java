package com.class15;

public class RecapTask2 {

	public static void main(String[] args) {
		// TaskGroup2
		
int arr[] = { 1000, 46, 1, 86,300, 2 };
        
        int min = arr[0];//0
        int secondLargest = 0;//0
        int largest = 0;//0
        
        for(int a: arr) {
            if(a>largest) {
                largest =a;
            }
            if(a < min) {
                min = a;
            }
        }
        for(int a : arr) {
            
            if(a> secondLargest && a <largest) {
                
                secondLargest = a;
            }
        }
        System.out.println("min = " + min);
        System.out.println("SecondLargest = "+ secondLargest);

        System.out.println("Largest= "+ largest);

	}

}
