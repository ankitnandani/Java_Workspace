package com.a217;

import java.util.Scanner;

public class TaskThreeA {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a year");
		
		int a = s.nextInt();
		
		if(a%4 == 0)
		{
			System.out.println("It is a leap year.");
		}
		
		else
		{
			System.out.println("It is not a leap year");
		}
		
		s.close();
	}
}
