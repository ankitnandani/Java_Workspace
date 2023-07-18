package com.a177;

import java.util.Scanner;

public class TaskSix {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter principle amount : ");
		
		int a = Integer.parseInt(s.nextLine());
		
		System.out.println("Simple Interest at 6% p.a. for 5 years is : "+(a*0.05*5));
		
		s.close();
	}
}
