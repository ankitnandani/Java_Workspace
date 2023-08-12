package com.a118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskSeventyOne {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String >();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before : "+colors);
		System.out.println("Enter element to replace 2nd element with : ");
		int a = s.nextInt();
		
		if(a < colors.size())
		{
			Collections.swap(colors, a, 2);
			System.out.println("After : "+colors);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		s.close();
	}
}
