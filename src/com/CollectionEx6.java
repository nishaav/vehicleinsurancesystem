package com;

//Collection Day 2 : File Name CollectionEx6 onwards

import java.util.*;

public class CollectionEx6 {

	public static void main(String[] args) {
		//Legacy classes : classes which have been modified by adding certain new functionalities to it.
		//Why we use vector class : because it implements various legacy methods.
		Vector<String> vector=new Vector<>();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		vector.add("A");
		vector.add("S");
		vector.add("K");
		vector.addElement("L");
		Vector<String> vector2=new Vector<>();
		vector2.addAll(vector);
		System.out.println(vector.contains("Z"));
		//empty or not
		System.out.println(vector.isEmpty());
		vector.clear();
		System.out.println(vector);
		System.out.println(vector2);
		System.out.println(vector2.firstElement());
		//System.out.println(vector.firstElement());
		vector2.add(0,"Z");
		vector2.insertElementAt("Y",1);
		System.out.println(vector2);
		System.out.println(vector2.lastElement());
		
		vector2.remove(0);
		vector2.remove("K");
		vector2.removeElement("S");
		vector2.removeElementAt(3);
		
		System.out.println(vector2);
		
		
		
	}

}
