package com.setmore.map;
import java.util.*;
import java.util.Map.Entry;
public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap();
		m.put("revathi",100); // entry
		m.put("vikky", 200);
		m.put("bala", 300);
		//m.put("bala", 400); key cannot be duplicate value can be duplicate
		m.put(null, 400); // will not throw error in case of duplication but old value will be replaced in case of keys and it retursn the old value
		System.out.println(m.put(null, 500));// only one nul value is allowed incase of keys
		m.put("hello", 500);// values can be duplicated
		m.put("abcd", null); 
		m.put("success", null);// more than one null values can be allowed
		System.out.println(m); // output will be {key=value,key=value} it will not preserve insertion order
		Set s = m.keySet();
		System.out.println(s); // reuturns only keys, return type is set because in set duplications are not allowed
		Collection c =m.values();
		System.out.println(c);// only values
		
		Set s1 = m.entrySet();
		System.out.println(s1);// returns key value pair
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1= (Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		HashMap m1 = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1.equals(i2));
		m1.put(i1, "revathi");
		System.out.println(m1.put(i2, "bala"));
		System.out.println(m1); // duplicate keys so jvm will check the duplicates keys based on .equals() method
	}

}
