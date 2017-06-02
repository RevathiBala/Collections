package com.setmore.collections;
import java.util.*;
public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("revathi");
		l.add("meena");
		l.add("bala");
		l.add("vikky");
		System.out.println("original:"+l);
		Collections.reverse(l); // to reverse the element
		System.out.println("reversed order:");
		for(Object s : l){
			System.out.println(s);
		}
	}

}
