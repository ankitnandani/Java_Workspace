package com.a078;

import java.util.ArrayList;

public class TaskFiftyTwo {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("cyan");
		
		System.out.println("Before: "+ colors);
		
		colors.remove(3);
		
		System.out.println("After: "+colors);
	}
}
