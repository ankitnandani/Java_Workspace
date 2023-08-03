package com.a028;

import java.util.Scanner;

public class TaskThirtyFive {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = s.nextInt();
		
		System.out.println("Enter second number : ");
		int b = s.nextInt();
		
		try
		{
			System.out.println("Answer : "+ (a/b));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("End Program");
		}
		s.close();
	}
}
