package com.setmore.map;
import java.util.*;

class MobileInventory{
	String model;
	String mobileName;
	long cost;
	
	MobileInventory(String model,String mobileName,long cost){
		this.model=model;
		this.mobileName=mobileName;
		this.cost=cost;
	}
	public String toString(){
		return mobileName+" "+model+" "+cost;
		
	}
}
public class HashTableUserdefined {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<MobileInventory,Integer> t = new Hashtable<MobileInventory,Integer>();
		t.put(new MobileInventory("A7","samsung",350000), 1);
		t.put(new MobileInventory("A5","nokia",350000), 1);
		t.put(new MobileInventory("A2","apple",350000), 1);
		t.put(new MobileInventory("CZ","samsung2",350000), 1);
		t.put(new MobileInventory("A6","samsung3",350000), 1);
		
		for(Map.Entry<MobileInventory,Integer> map : t.entrySet()){
			System.out.println(map.getKey()+" " +map.getValue());
		}
	}

}
