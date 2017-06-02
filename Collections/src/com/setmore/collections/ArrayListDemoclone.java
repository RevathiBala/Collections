package com.setmore.collections;
import java.util.*;
public class ArrayListDemoclone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(null);
		al.add("revathi");
		al.add("ghtm");
		
		ArrayList<String> copy = (ArrayList) al.clone();
		System.out.println(copy);
	}

}
