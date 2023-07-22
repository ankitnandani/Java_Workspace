package com.a217;

import java.util.Scanner;

public class TaskEight {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String a = s.nextLine();
		
		int letter=0;
		int space =0;
		int number =0;
		int other = 0;
		
		for(int i =0; i< a.length() ; i++)
		{
			if(Character.isAlphabetic(a.charAt(i)))
			{
				letter++;
			}
			
			else if(Character.isDigit(a.charAt(i)))
			{
				number++;
			}
			else if(a.charAt(i) == ' ')
			{
				space++;
			}
			else
			{
				other++;
			}
				
		}
		
		System.out.println("Letters:"+letter);
		System.out.println("Numbers: "+number);
		System.out.println("Spaces: "+space);
		System.out.println("Others: "+other);
		
		s.close();
	}
}
