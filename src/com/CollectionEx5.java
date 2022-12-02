package com;

import java.util.*;
public class CollectionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Nisha");
		Student s2=new Student(2,"Nishant");
		Student s3=new Student(3,"Isha");
		Student s4=new Student(4,"Ishant");
		Student s5=new Student(5,"Disha");
		Student s6=new Student(6,"Dishant");
		
		List<Student> li=new ArrayList<>();//Dynamic Method Dispatching 
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		//enhanced for loop
		for(Student student: li)
		{
			System.out.println(student.id+" "+student.name);
		}
		// for loop
		for(int i=0;i<li.size();i++)
		{
			Student student=li.get(i);
			System.out.println(student.id+" "+student.name);
		}
		// Iterator
		Iterator<Student> itr=li.iterator();
		while(itr.hasNext())
		{
			Student student=itr.next();
			System.out.println(student.id+" "+student.name);
			
		}
	}

}
class Student
{
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}



