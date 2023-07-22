package com.a217;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String adsf[])
	{
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("Enter a single character or 1 to exit");
			
			String a = s.next();
			
			if(a.length() > 1)
			{
				System.out.println("You have entered more than one character please try again");
				break;
			}
			
			char b = a.charAt(0);
			
			if(!Character.isAlphabetic(b))
			{
				System.out.println("You have not entered alphabet. Please enter alphabet");
				break;
			}
			
			if((b == 'a') || (b == 'e') ||b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U')
			{
				System.out.println("It is a vowel");
				break;
			}
			else
			{
				System.out.println("It is a consonant");
				break;
			}
			
		}
		
		s.close();
	}
}
