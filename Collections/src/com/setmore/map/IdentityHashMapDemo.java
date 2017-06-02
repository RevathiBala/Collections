package com.setmore.map;
import java.util.*;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap i = new IdentityHashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		System.out.println(I1==I2); // it will check the refernce for duplicate keys
		i.put(I1, "revathi");
		i.put(I2, "bala");
		System.out.println(i);
	}

}
