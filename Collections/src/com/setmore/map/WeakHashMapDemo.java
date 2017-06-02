package com.setmore.map;
import java.util.*;
public class WeakHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WeakHashMap map = new WeakHashMap(); In case of weak hash map the object can be delete by gc()
		HashMap map= new HashMap();
		Temp t = new Temp();
		map.put(t, "revathi");
		System.out.println(map);
		t=null;
		System.gc(); // eventhough gc is called it cannot delete the object because the object associated with hashmap
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(map);
	}

}
class Temp{
	public String toString(){
		return "temp";
	}
	public void finalize(){
		System.out.println("finalize mehtod");
	}
}