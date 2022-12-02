package com;

import java.util.*;
public class CollectionEx7 {

	public static void main(String[] args) {
		//Set Implementation :
		
		//Dynamically growable
		//does not duplicacy
		
		//HashSet
		//LinkedHashSet
		//TreeSet
		//LinkedHashSet :
		/*
		 * ->Duplicacy of elements is not allowed
		 * ->insertion order
		 * -> working on linkedlist architecture of nodes to store the data.
		 * -> accept null instance in the collection. 
		 */
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		
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
		LinkedHashSet<String> lhs1=(LinkedHashSet<String>)lhs.clone();
		System.out.println(lhs1);
		
		
		
		
		
		
		
		
		
		
	}

}
