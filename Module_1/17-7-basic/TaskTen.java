package com.a177;

import java.util.Scanner;

public class TaskTen {
	public static void main(String asdf[])
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		int prime = 0;
		
		for(int i = 2; i<a; i++)
		{
			if(a%i == 0)
			{
				prime=1;
				break;
			}
		}
		
		if(prime==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}

		s.close();
	}
}
