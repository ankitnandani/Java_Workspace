package com.a177;

import java.util.Scanner;

public class TaskNine {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter year : ");
		
		int year= s.nextInt();
		
		if(year%4 == 0)
		{
			System.out.println("It is a leap year");
			
		}
		else
		{
			System.out.println("It is not a leap year");
		}

		s.close();
	}
}
