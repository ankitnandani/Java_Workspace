package com.a217;

import java.util.Scanner;

public class TaskSeven {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = s.nextInt();
		
		int count = 0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		
		System.out.println("Number of digits are : "+ count);
		
		s.close();
	}
}
