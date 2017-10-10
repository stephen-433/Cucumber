package javapractice;

import java.util.*;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class HashMapDemo {
   	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        @SuppressWarnings("unchecked")
		HashMap<String,String> hmap=new HashMap();
		
		hmap.put("key1", "value1");
		hmap.put("key2", "value2");
		hmap.put("key3", "value3");
		hmap.put("key4", "value4");
		
		System.out.println("keySet()::="+hmap.keySet()+"\n"+hmap.keySet().getClass());
		System.out.println("values()::="+hmap.values()+"\n"+hmap.values().getClass());
		System.out.println("entrySet() ::="+hmap.entrySet()+"\n"+hmap.entrySet().getClass());
		
		Set<String> set= hmap.keySet();
		System.out.println("keys="+set);
		System.out.println("Iterating keys");
		//iterate keys
		for(String d:set){
			System.out.println(d);
		}		
		System.out.println("--------------");
		//Set<String> value=(Set<String>) hmap.values();
		Collection<String> values=hmap.values();
		System.out.println("Values="+values);
		System.out.println("Iterating Values");
		System.out.println("Iterating values() using Iterator interface");
		Iterator it=values.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Iterating values() using for-each loop");
		for(String va : hmap.values()){
			System.out.println(va);
		}
		System.out.println("Iterating entries of a hashmap");
		for(Map.Entry<String, String> s : hmap.entrySet() ){
			System.out.println(s.getKey()+"=="+s.getValue());
		}
		//Get specific value based on its key
		System.out.println("Getting specific value of a key using get() method."+"\n"+"value of key3="+hmap.get("key3"));
		//Get all hashmap values based on its key using get() method
		System.out.println("Get all hashmap values based on its key using get() method");
		for(Map.Entry<String, String> s : hmap.entrySet() ){
			System.out.println(s.getKey()+"=="+hmap.get(s.getKey()));
		}
		
	}

}
