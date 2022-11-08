package com.poly;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods ob1 = new Methods();
		
		System.out.println("Example of Method Overloading");
		System.out.println("------------------------------");
		System.out.println("Area of Rectangle is = "+ob1.CalcArea(5, 6));
		System.out.println("Area of Square is = "+ob1.CalcArea(8));
		System.out.println("Area of Triangle is = "+ob1.CalcArea(5.5, 6.5));

	}

}
