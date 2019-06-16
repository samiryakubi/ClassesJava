package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Person> personDetail=new HashMap<>();
		personDetail.put(2, new Person("Sayed", "Abi",    45, 89990));
		personDetail.put(2, new Person("baba", "Nabi",    30, 96500));
		personDetail.put(2, new Person("zaki", "Haidary", 25, 50000));
		personDetail.put(2, new Person("Sam", "Qaderi",   56, 110000));
		 
		Collection<Person> personId=personDetail.values();
		for(Person person:personId) {
	       person.personInfo();
	}
  }
}