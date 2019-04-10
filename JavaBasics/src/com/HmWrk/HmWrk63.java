package com.HmWrk;

public class HmWrk63 {

	public static void main(String[] args) {
		int[][] array = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		 // true

				boolean flag = false;
				
				for (int i = 0; i < array.length; i++) {
					if (array.length == array[i].length){
						flag = true;
					}
					break;
				}
				System.out.println(flag);
			}

	}


