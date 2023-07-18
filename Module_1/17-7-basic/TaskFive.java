package com.a177;

import java.util.Scanner;

public class TaskFive {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter base of triangle : ");
		
		int a = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter height of triangle : ");
		
		int b = Integer.parseInt(s.nextLine());
		
		System.out.println("Area of Triangle is : "+(0.5*a*b));
		
		s.close();
	}
}
