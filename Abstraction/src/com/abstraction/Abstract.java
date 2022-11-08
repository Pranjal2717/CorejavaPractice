package com.abstraction;

public abstract class Abstract {
	
	abstract void display();
	{
		
	}
	
	abstract int sum(int a, int b);
	{
		
	}
	
	public void print()
	{
		System.out.println(".....Non Abstract Method.....");
		System.out.println();
	}

}

class Test extends Abstract
{

	
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println(".....Abstract Method.....");
		
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	
	
	
}
