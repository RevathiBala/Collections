package com.setmore.linkedlist;
import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("revathi");
		l.add("bala");
		l.add("hello");
		l.add("meena");
		System.out.println(l);
		ListIterator itr = l.listIterator();
		while(itr.hasNext()){
			String s = (String) itr.next();
			if(s.equals("revathi")){
				itr.remove(); // remove is possible in list iterator
			}
			else if(s.equals("bala")){
				itr.add("abcd"); // adding is possible
			}
			else if(s.equals("meena")){
				itr.set("hgjk"); // replace
			}
			System.out.println(l);
		}
	}

}
