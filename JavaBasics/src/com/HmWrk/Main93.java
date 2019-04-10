package com.HmWrk;

public class Main93 {
	public static char getChar(String word, int index) {

	       char ch = word.charAt(index);
	       return ch;
	   }

	   public static void main(String[] args) {
	       System.out.println(getChar("hello",1));
	   }
	}