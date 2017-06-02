package com.setmore.vector;
import java.util.*;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector al = new Vector();
		
		for(int i=0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		Enumeration e = al.elements();
		System.out.println(e.getClass().getName()); // return vector$1 we cannot directly create obj for interface iterator getting obj for internal class
		while(e.hasMoreElements()){
			Integer i= (Integer) e.nextElement();
			if(i%2==0){
				System.out.println(i);
			}
		}
		System.out.println(al);
	}

}
