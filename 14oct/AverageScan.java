/* Program: To calculate average using Scanner Input.
@Author: Pranjal Rajeev
@Date: 14 Oct 2022*/

//Impoting packages
import java.util.Scanner;

//Created class
class AverageScan{
	public static void main(String args[])
	{
		//taking input of numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int num3 = sc.nextInt();
		
		//calculating sum
		int sum = num1+num2+num3;
		
		//calculating average
		int average = sum/3;
		
		//printing result
		System.out.println("Average of 3 number ="+average);
	}
}