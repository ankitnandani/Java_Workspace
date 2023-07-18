package com.a177;

import java.util.Scanner;

public class TaskEight {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		if(a > 0)
		{
			System.out.println("Number is positive");
		}
		else if(a< 0)
		{
			System.out.println("Number is negative");
			
		}
		else
		{
			System.out.println("Number is zero");
		}
		
		s.close();
	}
}
