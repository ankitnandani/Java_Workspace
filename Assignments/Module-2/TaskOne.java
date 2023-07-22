package com.a217;

import java.util.Scanner;

public class TaskOne {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = s.nextInt();
		
		System.out.println("Enter a number : ");
		int b = s.nextInt();
		
		System.out.println("Enter a number : ");
		int c = s.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+ " is greatest");
			}
			else
			{
				System.out.println(c +" is greatest");
				
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is greatest");
			}
			else
			{
				System.out.println(c+ " is greatest");
			}
		}
		
		s.close();
	}
}
