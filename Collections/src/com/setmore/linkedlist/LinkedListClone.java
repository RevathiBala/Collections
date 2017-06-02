package com.setmore.linkedlist;
import java.util.*;
public class LinkedListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(1);
		l.add("revathi");
		l.add("bala");
		System.out.println(l);
		l.push("bnh");
		LinkedList l1=(LinkedList)l.clone();
		System.out.println(l1);
		Object[] strArr = new Object[l.size()];
        l.toArray(strArr);
        System.out.println("Created Array content:");
        for(Object str:strArr){
            System.out.println(str);
        }
        


	}

}
