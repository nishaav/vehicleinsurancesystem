package com;

import java.util.*;
public class CollectionEx10 {

	public static void main(String[] args) {

		//PriorityQueue:
		/* ->Elements are arranged on the basis of priority.
		 * ->it keeps on rearranging the elements on every new insertion or removal.
		 * 
		 * 
		 */
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		
		pq.add("Yash");
		pq.add("Aachal");
		pq.add("Abarna");
		pq.add("Sathish");
		
		pq.offer("Mukesh");
		
		System.out.println(pq);
		/* 
		 * In case collection is empty and we are trying to use
		 * 1) poll() : it will return null
		 * 2) remove() : it will throw the exception NoSuchElementException
		 */
		
		System.out.println(pq.remove());
		boolean result=pq.remove("A");
		System.out.println(pq.poll());
		
		System.out.println(result);
		
		System.out.println(pq);
		
		System.out.println(pq.isEmpty());
		
		System.out.println(pq.peek());
		
		System.out.println(pq.size());
		pq.clear();
		
		
		
		

	}

}
