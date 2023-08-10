package com.a098;

import java.util.ArrayList;
import java.util.Collections;

public class TaskSixtyTwo {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before : "+colors);
		
		Collections.reverse(colors);
		
		System.out.println("After : "+colors);
	}
}
