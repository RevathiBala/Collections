package com.setmore.map;
import java.util.*;
public class SortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap m = new TreeMap(); // default natual sorting order
		m.put(1000, "reva");
		m.put(2000, "hello");
		m.put(3000, "abc");
		System.out.println(m);
		System.out.println("first key"+m.firstKey());
		System.out.println("last key"+m.lastKey());
		System.out.println("head map"+m.headMap(2000));
		System.out.println("tail map"+m.tailMap(2000));
		System.out.println("sub map"+m.subMap(-1000, 4000));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
