package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {

	        ArrayList<String> eWords = new ArrayList<String>();

	        eWords.add("EZIZE");
            eWords.add("Aziz");
	        eWords.add("Zeke");
	        eWords.add("ehhhhhee");
	        eWords.add("Chelsea");
	        Iterator<String> wrds = eWords.iterator();
	        while (wrds.hasNext()) {
	            String eWord = wrds.next();
	            if (eWord.endsWith("e")) {
	                wrds.remove();
	            }
	        }
	        System.out.print(eWords);
	    }

	}