package com.setmore.collections;
import java.util.*;
class Student{
	int number;
	String name;
	int age;
	Student(int number,String name,int age){
		this.number=number;
		this.name=name;
		this.age=age;
	}
}
public class ArrayListUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"revathi",21);
		Student s2 = new Student(2,"vikky",24);
		Student s3 = new Student(3,"hanuman",35);
		ArrayList<Student>al =  new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next()); // It will print hash code
			Student st = (Student) itr.next();
			System.out.println(st.name+" "+st.age+" "+st.number);
		}

	}

}
