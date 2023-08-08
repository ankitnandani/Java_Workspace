package com.a078;

import java.util.ArrayList;
import java.util.Collections;

public class TaskFiftyFour {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before: "+ colors);
		
		Collections.sort(colors);
		
		System.out.println("After: "+colors);
	}
}
