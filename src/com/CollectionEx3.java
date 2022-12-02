package com;

import java.util.LinkedList;

public class CollectionEx3 {
	public static void main(String[] args) {
		
		//Instance creation in collection using ArrayList
		
		LinkedList<String> al=new LinkedList<String>();
		// java 8
		// diamond type inference rule
		LinkedList<String> al1=new LinkedList<>();
		//Generic : typesafety 

		al1.add("Priya");
		al1.add("Keerthana");
		al1.add("Priya");
		al1.add("Priyanka");
		al1.add("Shreya");
		al1.add("Geetika");
		al1.add("Sneha");
		
		//enhanced for loop
		for(String str:al1)
		{
			System.out.println(str);
		}
		System.out.println(al1.size());
		// for loop
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		
		System.out.println(al1.contains("Sneha"));
		System.out.println(al1.contains("sneha"));
		System.out.println(al1.indexOf("Priya"));
		System.out.println(al1.lastIndexOf("Priya"));
		
		al1.add(1, "Aachal");
		System.out.println(al1);
		al1.remove(5);
		System.out.println(al1);
		
		
		al1.remove("Priya");
		System.out.println(al1);
		al1.set(4, "Pallavi");
		System.out.println(al1);
		
		//1-2 drawbacks of arraylist
		
		
		
	}


}
