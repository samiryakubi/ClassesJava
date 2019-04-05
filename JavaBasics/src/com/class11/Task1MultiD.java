package com.class11;

public class Task1MultiD {

	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values:
		 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
         *After storing values print the following:
         * Mrs Smith, Mr Obama, Ms Jackson.
		 */
		
		String [][]name=new String[4][4];
		
		name[0][0]="Mr";
		name[0][1]="Mrs";
		name[0][2]="Ms";
		name[0][3]="Miss";
		
		name[1][0]="Smith";
		name[1][1]="Jordan";
		name[1][2]="Jackson";
		name[1][3]="Obama";
		
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);                                                    
		System.out.println(name[0][2]+" "+name[1][2]);	
		//2ndway
		String[][]Nm= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Obama","Jordan","Jackson"},
		};
		System.out.println(Nm[0][1]+" "+Nm[1][0]);
		System.out.println(Nm[0][0]+" "+Nm[1][3]);
		System.out.println(Nm[0][2]+" "+Nm[1][2]);
	}

}
