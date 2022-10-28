package com.DoWhile;

import java.util.Scanner;

public class Fruits {

	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Enter name of fruit: ");
			name = sc.next();
			System.out.println("-------------------------------------------");
			System.out.println("Do you want to add more names: (1=yes/0=no)");
			ch = sc.nextInt();
		}while(ch==1);

	}

}
