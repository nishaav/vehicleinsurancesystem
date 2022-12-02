package com;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionEx8 {

	public static void main(String[] args) {
		//TreeSet : ascending order
		TreeSet<String> lhs=new TreeSet<>();
		//lexicographic sorting : dictionary style
		//does not accept null element , rather it will throw NullPointerException
		// retrieval of elements from the collection is very fast.
		lhs.add("Geetika");
		lhs.add("Priya");
		lhs.add("Geeta");
		lhs.add("Gaurav");
		lhs.add("Yash");
		lhs.add("Manav");
		lhs.add("Pranjal");
		lhs.add("Geetika");
		//lhs.add(null);: it will throw NullPointerException
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
		TreeSet<String> lhs1=(TreeSet<String>)lhs.clone();
		System.out.println(lhs1);
		
		System.out.println(lhs1.ceiling("Geeta"));
		System.out.println(lhs1.first());
		System.out.println(lhs1.floor("Geeta"));
		System.out.println(lhs1.pollFirst());
		System.out.println(lhs1.last());
		System.out.println(lhs1.pollLast());
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(23);
		ts.add(45);
		ts.add(67);
		ts.add(34);
		ts.add(78);
		ts.add(1);
		ts.add(21);
		ts.add(10);
		ts.add(19);
		
		System.out.println(ts);
		
		System.out.println(ts.ceiling(2));
		System.out.println(ts.floor(50));
		
		
		
		
		
		
		
		
		
	}

}
