package com;

import java.util.*;
public class CollectionEx17 {

	public static void main(String[] args) {
		
		ArrayList<Emp> al=new ArrayList<>();
		Emp e1=new Emp(23,"Mukesh");
		Emp e2=new Emp(23,"Mohan");
		Emp e3=new Emp(21,"Abarna");
		Emp e4=new Emp(20,"Yash");
		Emp e5=new Emp(25,"Gautam");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println("Before calling Sort : ");
		for(Emp emp :al)
		{
			System.out.println(emp.id+" : "+emp.name);
		}
		
		Collections.sort(al);
		System.out.println("After calling Sort : ");
		for(Emp emp :al)
		{
			System.out.println(emp.id+" : "+emp.name);
		}
		//sorting the user defined collection

	}
}

class Emp implements Comparable<Emp>
{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
//	@Override
//	public int compareTo(Emp o) {
//		
//		if(id==o.id)
//		{
//			return 0;
//		}
//		else if(id>o.id)
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
//		/*
//		 *  positive integer  : the current object is greater than the specified one (1)
//		 *  negative integer : the current object is smaller than the specified one (-1)
//		 *  zero integer : the current object is equal to the specified one (0)
//		 */
//	}
	
	
	@Override
	public int compareTo(Emp o)
	{
		return name.compareTo(o.name);
	}
}
/*
 * 
 * Comparable interface :to sort the objects on the basis of a single element
 * it is located in java.lang
 * Comparator interface :to sort the objects on the basis of multiple elements
 * it is located in java.util
 */
