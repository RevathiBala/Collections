package com.setmore.map;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap map = new TreeMap();
		map.put(100, "revathi");
		map.put(200, "bala");
		map.put(300, 100); // values can be homogeneous
		//map.put("reva", "vikky"); this will throw class cast exception cannot allow keys as homogeneous
		System.out.println(map);
	}

}
