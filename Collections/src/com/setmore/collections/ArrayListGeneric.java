package com.setmore.collections;
import java.util.*;

class Book{
	int id;
	String name,author;

	Book(int id, String name, String author){
		this.id=id;
		this.name=name;
		this.author=author;	
	}
}
public class ArrayListGeneric {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"win friends","dany");
		Book b2 = new Book(2,"rich dad", "revathi");
		Book b3 = new Book(3,"success review","revathi");
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
//		for(Book b: al){
//			System.out.println(b.id+" "+b.name+" "+b.author);
//		}
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Book b = (Book) itr.next();
		}

	}

}
