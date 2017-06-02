package com.setmore.map;
import java.util.*;
class Price{
	int price;
	String fruitName;
	
	Price(int price, String fruitName){
		this.price=price;
		this.fruitName=fruitName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
	int result = 1;
		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
		result = prime * result + price;
		return result;
	}

//	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (fruitName == null) {
			if (other.fruitName != null)
				return false;
		} else if (!fruitName.equals(other.fruitName))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public String getFruitName() {
//		return fruitName;
//	}
//
//	public void setFruitName(String fruitName) {
//		this.fruitName = fruitName;
//	}
	public String toString(){
		return price+" "+fruitName;
	}
	
}
public class HashMapUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Price,String> hm = new HashMap<Price,String>();
		Price p1 = new Price(100,"mango");
		Price p2 = new Price(200,"apple");
		Price p3 = new Price(500,"custard");
		Price p4 = new Price(700,"grapes");
		hm.put(p1, "mango"); // key cannot accept duplicate keys so inserting price as a key
		hm.put(p2, "apple");
		hm.put(p3, "custard");
		hm.put(p4, "grapes");
		Price p5 = new Price(200,"apple");
		hm.put(p5, "apple");
		Set set1 = hm.keySet();
		System.out.println(set1);
		Collection c = hm.values();
		
		for(Map.Entry<Price, String> map : hm.entrySet()){
			Price key =map.getKey();
			String value = map.getValue();
			System.out.println(key+" "+value);
		}
	}

}
