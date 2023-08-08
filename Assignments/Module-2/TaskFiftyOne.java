package com.a078;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFiftyOne {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println(colors);
		
		System.out.println("Enter index to update element : ");
		int a = s.nextInt();
		
		if(a<colors.size())
		{
			System.out.println("Enter new value of element : ");
			String temp = s.next();
			
			colors.set(a, temp);
		
			System.out.println(colors);
		}
		else
		{
			System.out.println("Invalid index entered. ");
		}
		
		s.close();
	}
}
