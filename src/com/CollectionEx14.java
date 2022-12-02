package com;

import java.util.TreeMap;
import java.util.Map;

public class CollectionEx14 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<>();
		//HashMap<K,V>
		/*->Null key is not acceptable in TreeMap
		 * ->It works on only unique elements.
		 * 
		 */
		hm.put(1, "Abarna");
		hm.put(4, "Ankita");
		hm.put(2, "Shreya");
		hm.put(7, "Arun");
		hm.put(3, "Mohan");
		hm.put(1, "Dipika");
		hm.put(5, null);
		for(Map.Entry m:hm.entrySet())
		{	
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		TreeMap<Integer,String> hm1=new TreeMap<>();
		hm1.putAll(hm);//to add all sets in another map collection.
		hm1.putIfAbsent(8, "Aachal");//if key is not existing then only the new set will be inserted.
		System.out.println(hm1);
		//hm1.remove(null);
		hm1.remove(7,"Arun");
		System.out.println(hm1);
		hm1.replace(3, "Manish");
		hm1.replace(1, "Dipika","Diya");
		System.out.println(hm1);
		
		TreeMap<Integer,Employee> he=new TreeMap<>();
		
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
/*
 * 
 */


