package com.jfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		

		Employee e1 = new Employee(1, "name1", 101);
		Employee e2 = e1;
		Employee e3 = new Employee(3, "name1", 101);
		Employee e4 = new Employee(2, "name2", 101);
		
		
		List<Employee> li = new ArrayList<>();
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
		
		System.out.println(" list size is -->"+ li.size());
		
		for(Employee e : li) {
			System.out.println("Hashcode of "+e.getEmpName()+"--->"+ e.hashCode());
//			System.out.println("equals method calling --->" + e.equals(e));
		}
		
		Set<Employee> set = new HashSet<>();
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		
		System.out.println(" set size --->"+ set.size());
		for(Employee e : set) {
			System.out.println(e.toString()+" ,hashcode -->" + e.hashCode());
		}
	
	}
}
