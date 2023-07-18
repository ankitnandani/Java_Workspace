package com.a177;

import java.util.Scanner;

public class TaskTwenty {
	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int a = s.nextInt();
		
		int sum=a%10;
		
		while(a!=0)
		{
			if(a<10)
			{
				sum = sum + a%10;				
			}
			
			a=a/10;
		}
		
		System.out.println("Summation of first and last digits is : "+ sum);
		
		s.close();
	}
}
