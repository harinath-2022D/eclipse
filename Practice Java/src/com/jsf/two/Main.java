package com.jsf.two;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> customers = new ArrayList<>();
		customers.add("ABC VENTURES");
		customers.add("MANKIND PHARMA");
		// TODO Auto-generated method stub
		Material m1= new Material(1,"material1", IndustryType.CONSTRUCTION_INDUSTRY, customers);
		Material m2 = new Material(m1);
		Material m4 = m1;
		
		Material m5 = new Material();
		
		try {
			
			System.out.println("m1 obj ---> " + m1.toString()+"hashcode ---> "+m1.hashCode());
			m1.setIndustryType(IndustryType.MANUFACTURING_INDUSTRY);
			
			Material m3 = (Material) m1.clone();
			
			
			m1.setCustomers(new ArrayList<>());
			m1.setIndustryType(IndustryType.PHARMA_INDUSTRY);
			m5.setMaterialName("material changed");
			Material m6 = (Material) m5.clone();
			
			System.out.println("m2 obj ---> " + m2.toString() + "hashcode ---> "+m2.hashCode());
			System.out.println("m3 obj ---> "+ m3.toString() + "hashcode ---> "+m2.hashCode());
			System.out.println("m4 obj ---> "+ m4.toString()+ "hashcpde ---> "+ m4.hashCode());
			System.out.println("m5 obj ---> "+ m5.toString()+ "hashcpde ---> "+ m5.hashCode());
			System.out.println("m6 obj ---> "+ m6.toString()+ "hashcpde ---> "+ m6.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(m1.toString());
//		System.out.println(m1.hashCode());
//		System.out.println(m2.hashCode());
	}

}
