package com.stringrev;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter a String: ");
		s = sc.nextLine();
		Stringrev ob = new Stringrev();
		ob.Stringreverse(s);
		sc.close();

	}

}
