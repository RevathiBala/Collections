package com.setmore.map;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t = new TreeMap(new MyComparator());
		t.put("xxx", 100);
		t.put("aaa", 800);
		t.put("ccc", 10000);
		System.out.println(t);
		t.remove("aaa");
		System.out.println(t);
		
		
	}

}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2= o2.toString();
		return s2.compareTo(s1);
	}
	
}