package com.setmore.map;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h = new Hashtable();
		h.put(new Temp1(5),"A");
		h.put(new Temp1(8), "B");
		h.put(new Temp1(16), "c");
		System.out.println(h);
	}

}
class Temp1{
	int i;
	Temp1(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;	
	}
	public String toString(){
		return i+" ";
	}
}