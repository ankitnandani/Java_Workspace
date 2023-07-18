package com.a177;

import java.util.Scanner;

public class TaskEighteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		int max = a%10;
		
		while(a!=0)
		{
			if(a%10 > max)
			{
				max=a%10;
			}
			
			a=a/10;
		}
		
		System.out.println("Maximum digit is : "+(max));
		
		s.close();
	}
}
