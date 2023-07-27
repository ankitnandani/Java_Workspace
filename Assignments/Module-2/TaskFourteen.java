package com.a267;

import java.util.Scanner;

public class TaskFourteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter base string : ");
		String a = s.nextLine();
		
		System.out.println("Enter string to be concatenated : ");
		String b = s.nextLine();
		
		String output = a.concat(b);
		
		System.out.println("Output : "+output);
		
		
		s.close();
	}
}
