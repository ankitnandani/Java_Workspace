package com.a177;

import java.util.Scanner;

public class TaskFifteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		int[] fibonacci = new int[a];
		
		fibonacci[0]=0;
		fibonacci[1]=1;
		

		if(a>2)
		{
			for(int i=2; i<a; i++)
			{
				fibonacci[i] = fibonacci[i-1]+ fibonacci[i-2];
			}
		}
		
		for(int j = 0; j< fibonacci.length; j++)
		{
			System.out.print(fibonacci[j]);
		}
		
		s.close();
	}
}
