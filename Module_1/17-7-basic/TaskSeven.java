package com.a177;

import java.util.Scanner;

public class TaskSeven {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter subject marks : ");

		int a = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter subject marks : ");

		int b = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter subject marks : ");

		int c = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter subject marks : ");

		int d = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter subject marks : ");

		int e = Integer.parseInt(s.nextLine());
		
		System.out.println("Your Percentage is : "+((a+b+c+d+e)/5));
		
		s.close();
		
	}
}
