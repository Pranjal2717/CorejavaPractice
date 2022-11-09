package com.stringrev;



public class Stringrev {
	
	public void Stringreverse(String s)
	{
		System.out.println("Reverse of String is: ");
		for(int i=s.length(); i>0; i--)
		{
			System.out.print(s.charAt(i-1));
		}
	}
	
	

}
