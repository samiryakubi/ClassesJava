package com.class17;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 str=new Task3();
        str.palindrome("Hannah");
        str.palindrome("Bob");
        str.palindrome("John");

    }void palindrome(String str){
        String rev="";
        for(int i=str.length()-1; i>=0; i--) {
         rev+=str.charAt(i);
    }
        if(rev.equalsIgnoreCase(str)) {
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome");
        }
        
    }
}

