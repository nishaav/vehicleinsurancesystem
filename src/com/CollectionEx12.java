package com;

import java.util.*;
public class CollectionEx12 {

	/*
	 * List,Queue,Set : this hierarchy worked only with values.
	 * 
	 * Map : 
	 * ->stores the data in key-value pair.
	 * pair is referred as a 'SET'
	 * HashMap
	 * ->is arranging the elements on the basis of there hashcode
	 * ->data is arranged randomly on the basis of hashing algorithm
	 * ->HashMap can accept null key and null value
	 * -> Duplicacy is not allowed
	 * ->If we are trying to add duplicate key then value will get replaced but the updated one.
	 * LinkedHashMap
	 * ->elements are arranged in insertion order
	 * TreeMap
	 * ->elements are arranged in sorted order on the basis of key.
	 */
	public static void main(String args[])
	{
		//ArrayList<String> al=new ArrayList<>();
		HashMap<Integer,String> hm=new HashMap<>();
		//HashMap<K,V>
		hm.put(1, "Abarna");
		hm.put(4, "Ankita");
		hm.put(2, "Shreya");
		hm.put(7, "Arun");
		hm.put(3, "Mohan");
		hm.put(null, null);
		hm.put(1, "Dipika");
		for(Map.Entry m:hm.entrySet())
		{	
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.putAll(hm);//to add all sets in another map collection.
		hm1.putIfAbsent(8, "Aachal");//if key is not existing then only the new set will be inserted.
		System.out.println(hm1);
		hm1.remove(null);
		hm1.remove(7,"Arun");
		System.out.println(hm1);
		hm1.replace(3, "Manish");
		hm1.replace(1, "Dipika","Diya");
		System.out.println(hm1);
		
		
		HashMap<Integer,Employee> he=new HashMap<>();
		
		Employee e1=new Employee(1,"Jatin",25);
		Employee e2=new Employee(3,"Shrey",28);
		Employee e3=new Employee(2,"Priyank",24);
		
		he.put(20, e1);
		he.put(3, e2);
		he.put(21, e3);
		
		for(Map.Entry<Integer,Employee> m:he.entrySet())
		{
			System.out.println(m.getKey());
			Employee emp=m.getValue();
			System.out.println(emp.empId+" "+emp.empName+" "+emp.empAge);
		}
	}
}

class Employee
{
	int empId;
	String empName;
	int empAge;
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	

}


