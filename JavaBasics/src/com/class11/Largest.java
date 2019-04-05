package com.class11;

public class Largest {

	public static void main(String[] args) {
		//create an array of integers find the largest number
		int[] number= {200,600,900,560,780,781,901,1};
	       int largest=number[0];
	        for(int i=0;i<number.length;i++) {
              if(number[i]>largest) {
               largest=number[i];
            }
        }
          System.out.println("the largest numer is "+ largest);
		

	}

}
