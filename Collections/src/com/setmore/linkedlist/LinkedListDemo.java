package com.setmore.linkedlist;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(1);
		l.addFirst("revathi");
		l.addLast("bala");
		l.add("hello");
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.size());
		System.out.println(l.contains("revathi"));
		l.remove("hello");
		System.out.println(l.size());
		System.out.println(l.indexOf("revathi"));
		System.out.println(l.removeFirstOccurrence("revathi"));
		System.out.println(l);
	}

}
