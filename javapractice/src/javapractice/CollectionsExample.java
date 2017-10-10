package javapractice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.RandomAccess;



public class CollectionsExample {
	
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("key1", 1);
		hmap.put("key2", 2);
		hmap.put("key3", 3);
		hmap.put("key4", 4);
		System.out.println(hmap);
		System.out.println(hmap.put("key4", 5));
		System.out.println(hmap.get("key4"));
		System.out.println(hmap.get("key4"));
		
		HashMap<Integer, String> hmap1=new HashMap<Integer, String>();
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		System.out.println(I1.equals(I2));
		hmap1.put(I1, "pawan");
		hmap1.put(I2, "kalyan");//I1 and I2 are duplicate keys bcoz I1.equals(I2) returns true
		System.out.println("hmap1="+hmap1);
		
		IdentityHashMap<Integer, String> idmap=new IdentityHashMap<Integer, String>();
		Integer I3=new Integer(10);
		Integer I4=new Integer(10);
		System.out.println(I1==I2);
		idmap.put(I3, "pawan");//I3 and I4 are duplicate keys bcoz I1==I2 returns false
		idmap.put(I4, "kalyan");//
		System.out.println("idmap"+idmap);
		
		
		
		
		
		
		
		HashSet<String> h=new HashSet<String>();
		h.add("A");
		h.add("a");
		h.add("string");
		h.add(null);
		h.add("a");
		System.out.println(h.add("a"));
		System.out.println(h);
		
		System.out.println("----------------------");
		
		
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("A");
		lh.add("a");
		lh.add("string");
		lh.add(null);
		lh.add("a");
		lh.add("1");
		lh.add("5");
		lh.add("2");
		
		System.out.println(lh.add("a"));
		System.out.println(lh);
		
		System.out.println("----------------------");
		
		
		
		
		ArrayList<Comparable> o=new ArrayList<Comparable>();
		ArrayList<Comparable> l1=new ArrayList<Comparable>();
		LinkedList<Comparable> ll=new LinkedList<Comparable>();
		ll.add("onell");
		ll.add(15);
		ll.add(null);
		
		l1.add("onell");
		l1.add(15);
		l1.add(null);
		
		Iterator<Comparable> it=l1.iterator();
		while(it.hasNext()){
			System.out.println("iterator concept"+it.next());
		}
		
		
		System.out.println(o instanceof Serializable);
		System.out.println(o instanceof Cloneable);
		System.out.println(ll instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
		ArrayList<Comparable> l=new ArrayList<Comparable>(); //default initial capacity 10
		l.add("one");
		l.add("two");
		l.add("three");
		l.add(null);
		l.add(10);
		System.out.println("l="+l);
		o.addAll(l);
		
		System.out.println("o="+o);
		System.out.println(l.get(1));
		l.remove(0);
		l.add(0, "newadded");
		System.out.println("After remove l="+l);
		l.set(0, "newonee");
		System.out.println("After set l="+l);
		System.out.println("index of="+l.indexOf(l));
		System.out.println("o="+o);

	}
}
