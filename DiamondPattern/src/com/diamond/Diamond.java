/*@Author: Pranjal Rajeev
@Date: 28/10/22*/

//Package
package com.diamond;

//declaring class
public class Diamond {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variable
		int i, j , n=5;
		
		//upper Pyramid
		for(i=0; i<n;i++)//printing rows
		{
			for(j=5; j>i; j--)//printing spaces
			{
				System.out.print(" ");
			}
			for(j=0; j<=i; j++)//printing stars
			{
				System.out.print(" *");
			}
			
			System.out.println();//printing next line
		}
		
		//For lower Pyramid
		for(i=0; i<n;i++)//printing rows
		{
			for(j=0; j<=i; j++)//printing spaces
			{
				System.out.print(" ");
			}
			for(j=4; j>i; j--)//printing stars
			{
				System.out.print(" *");
			}
			
			System.out.println();//printing next line
		}
		

	}//end of main

}//end of class
