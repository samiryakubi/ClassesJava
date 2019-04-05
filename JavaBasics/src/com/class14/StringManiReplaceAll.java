package com.class14;

public class StringManiReplaceAll {

	public static void main(String[] args) {
		//2 replaceAll() - will replace all that matches specified pattern[regex];
		
				String str1="12Hello 3234 World 465%^%";
				String replacedNoNumbers=str1.replaceAll("[0-9]", "");
				System.out.println(replacedNoNumbers);
				
				String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
				System.out.println(newString);
				
//				String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//				System.out.println(replacedNoCharacter);
				
				String str2="1Hello123";
				System.out.println(str2.replaceAll("[^0-9]", ""));

	}

}
