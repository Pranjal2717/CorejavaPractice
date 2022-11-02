package com.Details;

public class Accenture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1 = new EmployeeDetails();
		e1.enterDetails(101, "Pranjal", 55000, 22, "CyberSecurity");
		e1.hikeSalary();
		EmployeeDetails e2 = new EmployeeDetails();
		e2.enterDetails(201, "Saurabh", 60000, 34, "Computer Science");
		e2.hikeSalary(20);
		
		System.out.println("-------------------------------------");
		e1.printDetails();
		
		System.out.println("-------------------------------------");
		e2.printDetails();

	}

}
