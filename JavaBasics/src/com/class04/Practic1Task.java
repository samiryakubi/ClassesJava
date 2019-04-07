package com.class04;

import java.util.Scanner;

public class Practic1Task {

	public static void main(String[] args) {
		
         double loan ;
         
         Scanner loanMoney = new Scanner(System.in);
         
         System.out.println("Please Enter loan amout");
         loan =loanMoney.nextDouble();	
         
         if (loan<200000) {
        	 System.out.println("Loan passed");
         }else {
        	System.out.println("Loan Recjected ");
         }
         
         

	}

}
