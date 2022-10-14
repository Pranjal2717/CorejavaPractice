/* Program: To calculate average using command line.
@Author: Pranjal Rajeev
@Date: 14 Oct 2022*/

//Created Class
class Average  
{
	public static void main(String args[])
	{
		//Declaration of variables
		int average=0;
		
		//Taking Inputs
		System.out.println("Enter 1st Number: "+Integer.parseInt(args[0]));
		System.out.println("Enter 2nd Number: "+Integer.parseInt(args[1]));
		System.out.println("Enter 3rd Number: "+Integer.parseInt(args[2]));
		
		//Calculating Sum
		int sum = Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);
		
		//Calculating Average
		average = sum/3;
		
		//Printing Result
		System.out.println("Average of 3 numbers is: "+average);
	}
}