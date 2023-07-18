package com.a177;

import java.util.Scanner;

public class TaskFour {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter radius : ");
		
		int a = Integer.parseInt(s.nextLine());
		
		System.out.println("Area of Circle is : "+(3.14*a*a));
		
		s.close();
	}
}
