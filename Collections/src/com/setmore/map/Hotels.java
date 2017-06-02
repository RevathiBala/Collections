package com.setmore.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
       this.name = name;
       this.age = age;
    }
	public String toString() {
	    return name + ":" + age;
	}

@Override
public int compareTo(Student o) {
    return Comparators.NAME.compare(this, o);
}


public static class Comparators {

    public static Comparator<Student> NAME = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Student> AGE = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    };
    public static Comparator<Student> NAMEANDAGE = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            int i = o1.name.compareTo(o2.name);
            if (i == 0) {
                i = o1.age - o2.age;
            }
            return i;
        }
    };
}
}

public class Hotels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add( new Student("chetinadu",21));
		ar.add( new Student("kfc",89));
		ar.add( new Student("saravanna bhavan",70));
		ar.add( new Student("maris",65));
		Collections.sort(ar, Student.Comparators.AGE);
		for(Student ht :ar){
			System.out.println(ht.age+" "+ht.name);
		}
	}

}
