package com.setmore.collections;
import java.util.*;


public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("revathi");
		al.add("revathi");
		al.add("meena");
		al.add("bala");
		System.out.println("elements before array"+al);
		System.out.println(al.subList(2, 4)); // getting the sublist from the array
		String[] str = new String[al.size()];
		al.toArray(str);
		
		System.out.println("element of after array");
		for(String s : str){
			System.out.println(s);
		}
	}

}
