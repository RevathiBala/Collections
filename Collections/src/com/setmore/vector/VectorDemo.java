package com.setmore.vector;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		vector.add("revathi");
		vector.add(1, "hello");
		vector.addElement("success");
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.elementAt(1));
		
		Enumeration e = vector.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
			
		}
		Vector v= new Vector(25,5);// here defalut capacity 25
		for(int i=0;i<25;i++){
			v.addElement(i);
		}
		System.out.println(v.capacity()); // now capacity 10
		v.addElement("A");
		System.out.println(v);
		v.addElement("B");
		System.out.println(v.capacity()); // now capacity is 20
		System.out.println(v);
	}

}
