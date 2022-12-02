package com;

import java.util.*;
public class CollectionEx11 {

	public static void main(String[] args) {
		
		
		//Deque : Double Ended Queue
		/*
		 * add or remove element from both the ends.(front and rear)
		 * Null values are not acceptable in arraydeque.
		 * Faster in fetching the data even from linkedlist.
		 *
		 */
		
		ArrayDeque<String> aq=new ArrayDeque<>();
		aq.add("Aman");
		aq.add("Naman");
		aq.add("Shaman");
		aq.add("Randhir");
		aq.add("Priyank");
		aq.add("Mukesh");
		aq.addFirst("Abarna");
		aq.addLast("Aachal");
		for(String str:aq)
		{
			System.out.println(str);
		}
		//aq.clear();
		System.out.println(aq.element());
		System.out.println(aq.getFirst());
		System.out.println(aq.getLast());
		System.out.println(aq.peek());
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());
		System.out.println(aq.contains("Shaman"));
		aq.remove();
		System.out.println(aq);
		aq.pop();
		aq.pollFirst();
		aq.pollLast();
		System.out.println(aq);
		
		
		
		
		
		
		
		
	}

}
