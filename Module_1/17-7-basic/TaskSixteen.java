package com.a177;

import java.util.Scanner;

public class TaskSixteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		for(int i =1 ; i<=12  ; i++)
		{
			System.out.println(a+" X "+i+" = "+(a*i));
		}
		s.close();
	}
}
