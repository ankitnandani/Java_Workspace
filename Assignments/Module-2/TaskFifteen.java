package com.a267;

import java.util.Scanner;

public class TaskFifteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter test string : ");
		String a = s.next();
		
		System.out.println("Enter matching string : ");
		String b = s.next();
		
		System.out.println("Matching : "+(a.equals(b)));
		
		s.close();
	}
}
