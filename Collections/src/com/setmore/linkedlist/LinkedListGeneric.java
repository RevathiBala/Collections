package com.setmore.linkedlist;
 import java.util.*;
class Hotel{
	String name;
	int ratings;
	long amount;
	
	Hotel(String name,int ratings,long amount){
		this.name=name;
		this.ratings=ratings;
		this.amount = amount;
	}
}
public class LinkedListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h1 = new Hotel("Barbeque",5, 4000);
		Hotel h2 = new Hotel("KFC", 5,8000);
		Hotel h3 = new Hotel("Sangeetha", 4, 5000);
		Hotel h4 = new Hotel("saravanna", 3, 8000);
		
		LinkedList<Hotel> l = new LinkedList<Hotel>();
		l.add(h1);
		l.add(h2);
		l.add(h3);
		l.add(h4);
//		for(Hotel h: l){
//			System.out.println(h.name+" "+h.ratings+" "+h.amount);
//		}
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			Hotel h = (Hotel)itr.next();
		}
	}

}
