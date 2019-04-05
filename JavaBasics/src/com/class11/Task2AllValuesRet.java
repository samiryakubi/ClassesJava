package com.class11;

public class Task2AllValuesRet {

	public static void main(String[] args) {
		 String[][] countries= {
                 {"North America:","Antigua"," Barbuda","Barbados","Costa Rica"},
                 {"South America:", "Argentina","Brazil","Ecuador"},
                 {"Europe:","Ukraine","Russia","Poland","France"},
                 {"Africa","Nigeria","Egypt","Tanzania","Kenya"},
               };
        for (int a=0;a<countries.length;a++) {
            for(int b=0;b<countries[a].length;b++) {
                System.out.print(countries[a][b]+",");
            }
            System.out.println();
        }

    }

}