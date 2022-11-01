/*Program to check Number is a Palindrome Number or Not
 @Author: Pranjal Rajeev
@Date: 01/11/2022 
 */

//Package
package com.method;

//importing package
import java.util.Scanner;

//creating class
public class Palindrome {
	
	//Method to check palindrome
	static void checkPalindrome(int number)
	{
		//declaring and initializing variables
		int remainder=0;
		int reversedNumber=0;
		int temp;
		
		//storing number into temp variable
		temp= number;
		
		//while loop to check palindrome
		while(number>0)
		{
			remainder = number%10;
			reversedNumber = reversedNumber*10 +remainder;
			number = number/10;
		}
		
		//condition to compare temp variable to reversed number
		if(reversedNumber == temp)
		{
			System.out.println(temp+" is a Palindrome Number");
		}
		else
			System.out.println("Not a Palindrome Number");
		
	}//end of method

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		int OriginalNumber=0;
		
		//taking input
		System.out.println("Enter a Number to check Palindrome: ");
		OriginalNumber = sc.nextInt();
		
		//calling method
		checkPalindrome(OriginalNumber);

	}//end of main method

}//end of class
