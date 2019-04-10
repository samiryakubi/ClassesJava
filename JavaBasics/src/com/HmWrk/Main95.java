package com.HmWrk;

public class Main95 {

	static String makeThreeSubstr(String word , int startIndex, int endIndex){
	  return word.substring(startIndex,endIndex).concat(word.substring(startIndex, endIndex)).concat(word).substring(startIndex,endIndex);
	  }

	
	//test case below (don't change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}