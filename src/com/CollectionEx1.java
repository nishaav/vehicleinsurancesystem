package com;

public class CollectionEx1 {

	public static void main(String[] args) {
		
		// int to Integer : Autoboxing
		int i=10;
		String str="Hello";
		System.out.println(str);
		Integer i1=i;//
		Integer i3=new Integer(i);
		Integer i2=Integer.valueOf(i);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i3);
		
		
		//float to Float : Autoboxing
		float f=23.4f;
		Float f1=f;
		Float f2=Float.valueOf(f);
	
		//Integer to int : Unboxing
		Integer in1=new Integer(20);
		int in2=in1;
		int in3=in1.intValue();
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in1);
		
		
		//Float to float : Unboxing
		Float fl1=new Float(23.4);
		float fl2=fl1;
		float fl3=fl1.floatValue();
		System.out.println(fl1);
		System.out.println(fl2);
		System.out.println(fl3);
		
		
		//Float to int
		Float ff1=new Float(34.67);
		int ii1=ff1.intValue();
		System.out.println(ii1);
		
		
		//String to int : unboxing
		//String s1="demo";
		//int value=Integer.parseInt(s1);
		
		String s1="123";
		int value=Integer.parseInt(s1);
		System.out.println(value);
		
		
		//String to float
		float value1=Float.parseFloat(s1);
		System.out.println(value1);
		
		//String to double
		double value2=Double.parseDouble(s1);
		System.out.println(value2);
		
		// int to String
		int v1=23;
		String s=String.valueOf(v1);
		System.out.println(s);
		
	}

}
