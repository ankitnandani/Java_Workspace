package com.a078;

import java.util.ArrayList;

public class TaskFortyNine {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before: "+ colors);
		
		colors.add(1,"orange");
		
		System.out.println("After: "+colors);
	}
}
