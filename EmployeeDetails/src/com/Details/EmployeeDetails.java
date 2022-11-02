package com.Details;

//creating class
public class EmployeeDetails {

	//instance variables
	private int eid;
	private String eName;
	private float eSalary;
	private int Age;
	private String Department;
	
			// method to enter bank details
			void enterDetails(int id, String name, float sal, int age, String depart) 
			{

				eid = id;
				eName = name;
				eSalary = sal;
				Age = age;
				Department = depart;
				
				
			}
			
			//method for hike salary
			void hikeSalary()
			{
				eSalary = eSalary + (eSalary*0.05f);
			}
			
			//method for hike salary
			void hikeSalary(float hikeRate)
			{
				eSalary = eSalary + (hikeRate/100 *eSalary);
			}
			
			// printDetails
			void printDetails() 
			{
				System.out.println("Employee ID:" + eid);
				System.out.println("Employee Name:" + eName);
				System.out.println("Salary :" + eSalary);
				System.out.println("Age :" + Age);
				System.out.println("Department:" + Department);
			}

}
