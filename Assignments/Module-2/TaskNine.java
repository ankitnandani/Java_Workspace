package com.a217;

import java.util.Scanner;

public class TaskNine {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a character");
		
		char a = s.next().charAt(0);
		
		System.out.println("ASCII Value: "+(int)a);
		
		s.close();
	}
}
