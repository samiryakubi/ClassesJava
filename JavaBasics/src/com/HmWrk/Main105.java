package com.HmWrk;

public class Main105 {
	static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	  public static void main(String[] args) {
	      Main105 obj1=new Main105();
	       Main105 obj2=new Main105();
	        Main105 obj3=new Main105();
	       obj1.increment();
	       obj2.increment();
	       obj3.increment();
	       
	       System.out.println(obj1.count);
	         System.out.println(obj2.count);
	           System.out.println(obj3.count);
	  }
	}