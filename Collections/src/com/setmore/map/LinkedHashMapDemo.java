package com.setmore.map;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
		m.put("revathi", 5000);
		m.put("bala",7890);
		m.put("hello", 890);
		m.put("abcd", 7899);
		System.out.println(m);
		Set s1 = m.keySet();
		System.out.println(s1);
		Collection c = m.values();
		System.out.println(c);
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
	}

}
