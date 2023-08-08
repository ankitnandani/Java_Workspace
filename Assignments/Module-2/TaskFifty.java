package com.a078;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFifty {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println(colors);
		
		System.out.println("Enter index to get element : ");
		int a = s.nextInt();
		
		if(a<colors.size())
		{
			System.out.println(colors.get(a));
		}
		else
		{
			System.out.println("Invalid Index");
		}
		
		s.close();
	}
}
