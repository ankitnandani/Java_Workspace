package com.a118;

import java.util.ArrayList;
import java.util.Collections;

public class TaskSixtyFive {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("before : "+ colors);
		
		Collections.swap(colors, 0, 2);
		
		System.out.println("After : "+ colors);
	}
}
