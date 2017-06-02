package com.setmore.collections;
import java.util.*;
public class ArrayListShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		
		List l1 = Collections.synchronizedList(l); // synchronized arraylist 
		l1.add(1);
		l1.add("revathi");
		l1.add("indhu");
		l1.add("suba");
		l1.add(2);
		Collections.swap(l, 2, 3); // for swapping the elements
		System.out.println(l1);
		Collections.shuffle(l1); 
		System.out.println("shuffled list: "+l1);
		Collections.shuffle(l1); // each time it will dipslay in diff order
		System.out.println(l1);
		
	}

}
