package com.setmore.map;
import java.util.*;
import java.util.Map.Entry;
 class HotelDemo {
	int ratings;
	long cost;
	String hotelName;
	
	HotelDemo(int ratings, long cost, String hotelName){
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
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
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
}
class CostComparator implements Comparator<HotelDemo>{

	@Override
	public int compare(HotelDemo h1, HotelDemo h2) {
		// TODO Auto-generated method stub
		if(h1.getCost()<h2.getCost()){
			return -1;
		}
		else if(h1.getCost() > h2.getCost()){
			return 1;
		}
		return 0;
	}
	
}
class RatingsComparator implements Comparator<HotelDemo>{

	@Override
	public int compare(HotelDemo h1, HotelDemo h2) {
		// TODO Auto-generated method stub
		if(h1.getRatings()>h2.getRatings()){
			return 1;
		}
		else if(h1.getRatings() < h2.getRatings()){
		return -1;
		}
		return 0;
	}
	
}
class HotelChain implements Comparator<HotelDemo>{
	private List<Comparator<HotelDemo>> listComparators;
	public  HotelChain(Comparator<HotelDemo>comparators, RatingsComparator ratingsComparator) {
        this.listComparators = Arrays.asList(comparators);
    }
	@Override
	public int compare(HotelDemo h1, HotelDemo h2) {
		// TODO Auto-generated method stub
		for (Comparator<HotelDemo> comparator : listComparators) {
            int result = comparator.compare(h1, h2);
            if (result !=0) {
                return result;
            }
        }
        return 0;
	}
	
}
class Hotel{
	public static void main(String args[]){
		ArrayList<HotelDemo> map = new ArrayList<HotelDemo>();
		map.add( new HotelDemo(3,800,"chetinadu"));
		map.add( new HotelDemo(4,800,"kfc"));
		map.add( new HotelDemo(4,1000,"saravanna bhavan"));
		map.add( new HotelDemo(4,1000,"maris"));
		Collections.sort(map, new HotelChain(
                new CostComparator(),
                new RatingsComparator())
                
        );
		
		for(HotelDemo ht :map){
			System.out.println(ht.getHotelName()+" "+ht.getCost()+" "+ht.getRatings());
		}
	}
}