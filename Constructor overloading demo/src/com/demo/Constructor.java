package com.demo;

public class Constructor {
	
	private int a, b;
	
	//default constructor
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	
	public Constructor(int a)
	{
		System.out.println("1 parameter");
		System.out.println(a);
	}
	
	public Constructor(int a, int b)
	{
		System.out.println("2 parameter");
		System.out.print(a+" ");
		System.out.print(b);
	}
	


}
