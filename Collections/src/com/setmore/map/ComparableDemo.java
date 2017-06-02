package com.setmore.map;
import java.util.*;

class Employee implements Comparable<Employee>{
	int empNo;
	String empName;
	String desc;
	int age;
	
	Employee(int empNo,String empName, String desc,int age){
		this.empNo=empNo;
		this.empName=empName;
		this.desc=desc;
		this.age = age;
	}
	public String toString(){
		return "Name:"+empName+" "+"Emp no: "+empNo+" "+" "+"Desc"+desc+" "+"Age: "+age;
	}
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(age==o.age){
			return 0;
		}
		else if(age> o.age){
			return 1;
		}
		return -1;
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Employee> m = new TreeMap<Integer,Employee>();
		Employee e1 = new Employee(1,"revathi","developer",23);
		Employee e2 = new Employee(2,"vikky","developer",27);
		Employee e3 = new Employee(3,"suba","dev",21);
		m.put(1, e1);
		m.put(2, e2);
		m.put(3, e3);
		
		for(Map.Entry<Integer, Employee> map : m.entrySet() ){
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}

}
