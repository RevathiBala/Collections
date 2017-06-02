package com.setmore.linkedlist;
import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		int i;
		for( i=0;i<=10;i++){
			al.add(i);
			
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Integer i1 = (Integer) itr.next();
			if(i1 % 2==0){
				System.out.println(i1);
			}
			else {
				itr.remove();
			}
			//System.out.println(i);
		}
		
	}

}
