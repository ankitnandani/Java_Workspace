package com.a177;

import java.util.Scanner;

public class TaskNineteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int a = s.nextInt();
		
		int sum=0;
		
		while(a!=0)
		{
			sum = sum + a%10;
			
			a=a/10;
		}
		
		System.out.println("Summation of digits is : "+ sum);
		
		s.close();
	}
}
