package com;

import java.util.*;

public class CollectionEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Learner l1=new Learner(5,"Priya",23);
		Learner l2=new Learner(1,"Priyank",22);
		Learner l3=new Learner(4,"Riya",27);
		Learner l4=new Learner(7,"Abarna",21);
		Learner l5=new Learner(9,"Mohan",20);
		Learner l6=new Learner(2,"Nisha",25);
		
		ArrayList<Learner> al=new ArrayList<>();
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		al.add(l5);
		al.add(l6);
		
		System.out.println("Before Sort : ");
		
		for(Learner l:al)
		{
			System.out.println(l.id+" "+l.name+" "+l.age);
		}
		
		Collections.sort(al, new AgeSort());
		
		System.out.println("After Age Sort : ");
		
		for(Learner l:al)
		{
			System.out.println(l.id+" "+l.name+" "+l.age);
		}
		
		Collections.sort(al, new IdSort());
		
		System.out.println("After Id Sort : ");
		
		for(Learner l:al)
		{
			System.out.println(l.id+" "+l.name+" "+l.age);
		}
		
		Collections.sort(al, new NameSort());
		
		System.out.println("After Name Sort : ");
		
		for(Learner l:al)
		{
			System.out.println(l.id+" "+l.name+" "+l.age);
		}
		
		
	}

}
class Learner
{
	int id;
	String name;
	int age;
	public Learner(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
class IdSort implements Comparator<Learner>
{

	@Override
	public int compare(Learner l1, Learner l2) {
		if(l1.id==l2.id)
		{
			return 0;
		}
		else if(l1.id>l2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
class AgeSort implements Comparator<Learner>
{
	@Override
	public int compare(Learner l1, Learner l2) {
		if(l1.age==l2.age)
		{
			return 0;
		}
		else if(l1.age>l2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class NameSort implements Comparator<Learner>
{
	@Override
	public int compare(Learner l1, Learner l2) {
		return (l1.name.compareTo(l2.name));
	
	}
}

