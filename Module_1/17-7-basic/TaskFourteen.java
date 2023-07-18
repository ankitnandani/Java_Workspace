package com.a177;

import java.util.Scanner;

public class TaskFourteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		int ans=1;
		
		while(a>0)
		{
			ans=ans*a;
			a--;
		}
		
		System.out.println("Factorial of Number is : "+ans);
		s.close();
	}
}
