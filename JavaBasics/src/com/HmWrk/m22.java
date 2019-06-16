package com.HmWrk;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class m22 {

	public static void main (String [] args) {
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		java.util.Iterator it = map.iterator();
		while (it.hasNext() ) 
		{
		System.out.print( it.next() + " " );
		}
	}
}
