package com.pattern1;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to print pattern: ");
		n=sc.nextInt();
		for(int rows= 1; rows<=n; rows++)
		{
			for(int cols=1; cols<=rows; cols++)
			{
				System.out.print(cols);
			}
			System.out.println();
		}

	}

}
