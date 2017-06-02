package com.setmore.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		List l1 = new ArrayList();
		l.add(1);
		l.add("revathi");
		l.add("vikky");
		l.remove(1);
		l.add(2, "meena");
		l1.addAll(l);
		System.out.println(l1);
		System.out.println(l1.indexOf("vikky"));// element is not there then it will return -1
		System.out.println(l1.lastIndexOf("vikky"));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.contains("revathi"));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println("elements "+l.get(0));
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
//		l1.clear();
//		System.out.println(l1); // empty array
		System.out.println(l.containsAll(l1)); // returns true or false based on all the eleemnts in one array is presetn in other arry
		
	}

}
