package com.class7;

public class EvenNumber {

	public static void main(String[] args) {
		
		
		int num =1 ;
		
		while(num <=20) {
			System.out.println("im inside the loop");
			if(num %2 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}

}
