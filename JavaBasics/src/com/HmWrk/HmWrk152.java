package com.HmWrk;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class HmWrk152 {
  public static void main(String[] args) {
   

  //Creating the HashMap 
         
        HashMap<String, String> map = new HashMap<String, String>();
         
        //Adding key-value pairs to HashMap
         
        map.put("ONE", "AAA");
         
        map.put("TWO", "BBB");
         
        map.put("THREE", "CCC");
         
        map.put("FOUR", "DDD");
         
        map.put("FIVE", "EEE");
         
        //Printing Key-value pairs
         
        System.out.println("HashMap Before Replace :");
         
        Set<Entry<String, String>> keyValueSet = map.entrySet();
         
        for (Entry<String, String> entry : keyValueSet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         
        System.out.println("------------------");
         
        //Removes the mapping for the key 'ONE' only if it is currently mapped to 'CCC'
         
        map.replace("THREE", "SUMAIR");
         
        //Removes the mapping for the key 'FIVE' only if it is currently mapped to 'EEE'
         
       map.remove("FOUR", "DDD");
         
        System.out.println("HashMap After Replace:");
         
        for (Entry<String, String> entry : keyValueSet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }   
}