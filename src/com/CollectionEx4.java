package com;

import java.util.*;
public class CollectionEx4 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Stack : LIFO : Last In First Out
		 *
		 */
		
		Stack<String> stack=new Stack<>();
		stack.add("A");
		stack.add("B");
		stack.add("C");
		stack.add("D");
		stack.add("E");
		stack.add("F");
		
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.push("G");
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.elementAt(0));
		System.out.println(stack.size());
		System.out.println(stack.search("a"));
		
		
		
		
		
	}

}





