package com.a098;

import java.util.ArrayList;

public class TaskSixtyThree {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before : "+colors);
		
		System.out.println("Sublist : "+ colors.subList(1,3));
	}
}
