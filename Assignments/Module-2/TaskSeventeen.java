package com.a267;

import java.util.Scanner;

public class TaskSeventeen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter base string : ");
		
		String a = s.nextLine();
		
		System.out.println("Enter start matching string : ");
		
		String b = s.next();
		
		System.out.println("Matching : "+(a.startsWith(b)));
		
		s.close();
	}
}
