/*
Program: WAP to print the grade according to the percentage
@author: Pranjal Rajeev
@Date: 19 oct 2022  
*/

//import scanner class
import java.util.Scanner;

class GradingSystem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float percentage;
		char grade;
		
		System.out.print(" Enter percentage ");
		percentage = sc.nextFloat();
		
		if(percentage>=85)
			grade='A';
		else if(percentage>=70)
			grade='B';
		else if(percentage>=55)
			grade='C';
		else if(percentage>=40)
			grade='D';
		else
			grade='F';
		
		if(grade=='F')
			System.out.println("Sorry!! You have Failed.. Work hard next time");
		else
			System.out.println("You have passed the exam with " +grade);
		
	}
}