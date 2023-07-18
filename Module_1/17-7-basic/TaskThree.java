package com.a177;

import java.util.Scanner;

public class TaskThree {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = Integer.parseInt(s.nextLine());
		
		System.out.println("Square of Number is : "+ (a*a));
		System.out.println("Cube of Number is : "+ (a*a*a));
		
		s.close();
		
	}
}
