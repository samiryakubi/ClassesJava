package com.class17_2;

public class Sam {

	public static void main(String[] args) {
	 
		Sam demo = new Sam();
		demo.nestedLoops();
        
 }
	  void nestedLoops() {
		for (int a = 0; a<=9; a++) {
	    	   for (int b=0; b<=9; b++) {
	    		   for  (int c =0; c<=9; c++) {
	    			   for (int d=0; d<=9; d++) {
	    				   System.out.println(a+""+b+""+c+""+d);
	    			   }
	    		   }
	    	   }
	     	}
	  }
	}

