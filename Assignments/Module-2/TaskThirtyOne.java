package com.a317;

import java.util.Scanner;

public class TaskThirtyOne {

	int factorial(int a)
	{
		if(a == 0 || a == 1)
		{
			return 1;
		}
		else
		{
			int product=1;
			for(int i = 1; i<=a ; i++)
			{
				product=product*i;
			}
			
			return product;
		}
	}
	
	public static void main(String asdf[])
	{
		TaskThirtyOne t1 = new TaskThirtyOne();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = s.nextInt();
		
		System.out.println("Factorial of "+ n+ " is "+ t1.factorial(n));
		
		s.close();
	}
}
