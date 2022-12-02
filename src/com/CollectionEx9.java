package com;

import java.util.Iterator;
import java.util.HashSet;

public class CollectionEx9 {

	public static void main(String[] args) {
		HashSet<String> lhs=new HashSet<>();
		//Random Order
		/*
		 * HashSet stores the elements on the basis of mechanism called as Hashing.
		 * unique elements
		 * null values are allowed
		 * It stores the elements on the basis of their hashcodes.
		 * default capacity : 16
		 * arraylist default capacity : 10
		 */
		// HashTable
		lhs.add("Geetika");
		lhs.add("Priya");
		lhs.add("Geeta");
		lhs.add("Gaurav");
		lhs.add("Yash");
		lhs.add("Manav");
		lhs.add("Pranjal");
		lhs.add("Geetika");
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());//
		System.out.println(lhs.contains("yash"));
		System.out.println(lhs.contains("Yash"));
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(lhs.isEmpty());
		//lhs.clear();
		System.out.println(lhs.equals("gaurav"));
		System.out.println(lhs.remove("Pranjal"));
		HashSet<String> lhs1=(HashSet<String>)lhs.clone();
		System.out.println(lhs1);
		
		
	}

}
