package com.a267;

import java.util.Scanner;

public class TaskThirteen {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		
		String a = s.nextLine();

			
		while(true)
		{
			System.out.println("Enter the index number, -1 to quit");
			
			int input = s.nextInt();
			
			if(input == -1)
				break;
			
			System.out.println(a.charAt(input));
		}
		
		s.close();
	}
}
