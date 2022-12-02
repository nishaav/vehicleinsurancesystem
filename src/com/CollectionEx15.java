package com;

import java.util.*;
public class CollectionEx15 {

	public static void main(String[] args) {
		//sort the data of arrayList
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(345);
		al.add(35);
		al.add(45);
		al.add(12);
		al.add(87);
		al.add(3);
		al.add(75);
		
		System.out.println(al);
		//Collection : interface
		//Collections.sort(al);
		
		
		Collections.sort(al,Collections.reverseOrder());
		
		//System.out.println(al);
		//Collections.reverse(al);
		System.out.println(al);
		
		
		
	}

}
