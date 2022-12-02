package com;

import java.util.*;
public class CollectionEx16 {

	public static void main(String args[])
	{
		//Converting collection to array
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Abarna");
		al.add("Yash");
		al.add("Sarit");
		al.add("Mohan");
		al.add("Aachal");

		String unames[]=al.toArray(new String[al.size()]);
		System.out.println("Collection To Array");
		for(String name:unames)
		{
			System.out.println(name);
		}
	
		//Convert array to collection
		System.out.println("Array To Collection");
		String countries[]= {"USA","Italy","Japan","Nepal","India"};
		List<String> li=Arrays.asList(countries);
		for(String str:li)
		{
			System.out.println(str);
		}
		// removed duplicacy,sorted,highest
		Integer ar[]= {100,34,12,89,67,8,12,5};
		List<Integer> li1=Arrays.asList(ar);
		TreeSet<Integer> ts=new TreeSet<>();
		ts.addAll(li1);
		System.out.println("Highest "+ts.last());
		
		
		
	}
}

/*
 * 
 *   arr : 100,34,12,89,67,8,12,5
 * 
 * 
 * 
 */
