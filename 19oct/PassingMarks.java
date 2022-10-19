/* Program: To understand the use of if else statements.
@Author: Pranjal Rajeev
@Date: 19 Oct 2022*/

//Impoting Scanner Class
import java.util.Scanner;

//Creating Class
class PassingMarks
{
	public static void main(String args[])
	{
		//Taking input of marks
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st marks: ");
		float num1 = sc.nextInt();
		System.out.println("Enter 2nd marks: ");
		float num2 = sc.nextInt();
		System.out.println("Enter 3rd marks: ");
		float num3 = sc.nextInt();
		
		float sum;
		
		//Calculating sum
		sum = num1+num2+num3;
		
		//Calculating Percentage
		float percentage = (sum/300)*100;
		
		//Checking pass or fail and printing result
		if(percentage>=40)
		{
			System.out.println("Congratulations You Have Passed Your Exam With " +percentage +"%");
		}
		else
		{
			System.out.println("Fail.."+percentage+"%");
		} //End of if else
	}
}