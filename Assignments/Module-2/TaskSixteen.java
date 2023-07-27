package com.a267;

import java.util.Scanner;

public class TaskSixteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter base string : ");
		
		String a = s.next();
		
		System.out.println("Enter end matching string : ");
		
		String b = s.next();
		
		System.out.println("Matching : "+(a.endsWith(b)));
		
		s.close();
	}
}
