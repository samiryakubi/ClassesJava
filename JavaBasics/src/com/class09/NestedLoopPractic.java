package com.class09;

public class NestedLoopPractic {

	public static void main(String[] args) {
		/*i want to print pattern
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 * 
		 */

		for (int x=5; x>=1; x--) {
		      for (int d=5; d>=1; d--) {
		          
		          System.out.print(x);
		      } 
		      System.out.println();
		}
	}
}