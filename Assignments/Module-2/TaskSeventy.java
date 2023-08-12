package com.a118;

import java.util.ArrayList;

public class TaskSeventy {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String >();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Size of ArrayList : "+ colors.size());
		
		colors.ensureCapacity(10);
		
		System.out.println("Capacity increased to 10");

		
	}
}