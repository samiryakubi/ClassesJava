package com.class06;

import java.util.Scanner;

public class riplHwk {
	public static void main(String[] args) {
		 
		boolean loan=true;
		 int  score;
		 String eligibility ;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Do you need a loan?");
		  loan=sc.nextBoolean();
		  
		  if (loan) {
		  System.out.println("What is your credit score?");
		  score=sc.nextInt();
		  if (score <600) {
		    eligibility="Not eligible";
		  }else if (score>=600 && score<=700)  {
		    eligibility="Maybe eligible";
		  }else if (score >=701 && score<=800) {
		    eligibility="Eligible";
		  } else if (score>800) {
		     eligibility="Definitely eligible";
		  } else { eligibility="Unknown";}
		     
		     System.out.println("The eligibility is "+eligibility);
		  } 
		    
		 }
		} 
	   
