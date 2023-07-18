package com.a177;

import java.util.Scanner;

public class TaskSeventeen {
	public static void main(String asdf[])
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = s.nextInt();
		
		int reverse=0;
		
		while(a!=0)
		{
			reverse=reverse*10 + a%10;
			
			a=a/10;
		}
		
		System.out.println("Reverse of a number is : "+ reverse);
		
		s.close();
	}
}
