package com.setmore.map;

import java.util.*;

class HotelDemo1 {
	int ratings;
	int cost;
	String hotelName;
	
	HotelDemo1(int ratings, int cost, String hotelName){
		this.ratings=ratings;
		this.cost=cost;
		this.hotelName=hotelName;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String toString(){
		return hotelName+" "+ratings+" "+cost;
	}
//	public static Comparator CostComparator<HotelDemo1> = new Comparator<HotelDemo1>
//	{
//	public int compare(HotelDemo1 o1, HotelDemo1 o2) {
//		// TODO Auto-generated method stub
//		if(o1.getCost() < o2.getCost()){
//			return -1;
//		}
//		else if(o1.getCost()> o2.getCost()){
//			return 1;
//		}
//		return 0;
//	}
//	}
//	public static Comparator<HotelDemo1> costComparator = new Comparator<HotelDemo1>() {
//
//		public int compare(HotelDemo1 o1, HotelDemo1 o2) {
//			if(o1.getCost() < o2.getCost() ){
//				System.out.println("hello");
//				return -1;
//		}
//			return 0;
//		}
//	};
//	public static Comparator<HotelDemo1> ratingsComparator = new Comparator<HotelDemo1>() {
//
//		public int compare(HotelDemo1 o1, HotelDemo1 o2) {
//			if(o1.getRatings() > o2.getRatings()){
//				System.out.println("yes");
//				return -1;
//		}
//			return 0;
//		}
//	};
}

class CostComparator1 implements Comparator<HotelDemo1>{
	public int compare(HotelDemo1 o1, HotelDemo1 o2) {
	if(o1.getCost() < o2.getCost() ){
			
			return -1;
	}
		return 0;
	}
}
class RatingsComparator1 implements Comparator<HotelDemo1>{
	public int compare(HotelDemo1 o1,HotelDemo1 o2){
		if(o1.getRatings()>o2.getRatings()){
			return 1;
		}
		return 0;
	}
}
class HotelComparator{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HotelDemo1> ar = new ArrayList<HotelDemo1>();  // In case of  list we can use collections.sort() so we can pass 2 comparators
		ar.add( new HotelDemo1(5,50,"chetinadu")); // In case of set we cannot use sort() so we need to create 2 set objects, as a parameter we need to call the comparator
		ar.add( new HotelDemo1(5,100,"kfc"));   // Treeset t = new TreeSet(new RatingsComparator())
		ar.add( new HotelDemo1(5,80,"saravanna bhavan"));
		ar.add( new HotelDemo1(5,10,"maris"));
		
		Collections.sort(ar,new CostComparator1());  
		Collections.sort(ar,new RatingsComparator1());
		for(HotelDemo1 ht :ar){
			System.out.println(ht.cost+" "+ht.hotelName+" "+ht.ratings);
		}
//		Collections.reverse(ar);
//		 Collections.sort(ar, Collections.reverseOrder());
//		Collections.sort(ar);
//		Collections.sort(ar,new CostComparator1()); 
		
//		for(HotelDemo1 ht :ar){
//			System.out.println(ht.cost+" "+ht.hotelName+" "+ht.ratings);
//		}
	}
}

