package com.a217;

import java.util.Scanner;

public class TaskFour {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[5];
		int sum=0;
		
		for(int i = 0; i<5; i++)
		{
			System.out.println("Enter a number");
			a[i] = s.nextInt();
		}
		
		for(int i=0; i<5; i++)
		{
			sum=sum + a[i];
		}
		
		System.out.println("Sum of Numbers : "+ sum);
		double avg = sum/5;
		System.out.println("Average of Numbers : "+avg);
		
		s.close();

	}
}
