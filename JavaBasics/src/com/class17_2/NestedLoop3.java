package com.class17_2;

public class NestedLoop3 {

	public static void main(String[] args) {
		
		NestedLoop3 demo = new NestedLoop3();
		demo.printMe();
	}
	
	void printMe() {
		for(int i = 1; i <=4 ; i++) {

            for(int x = 1; x <= 5; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
