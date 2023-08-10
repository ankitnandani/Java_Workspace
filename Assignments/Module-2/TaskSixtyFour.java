package com.a098;

import java.util.ArrayList;

public class TaskSixtyFour {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		ArrayList<String> colors2 = new ArrayList<String>();
		
		colors2.add("red");
		colors2.add("green");
		colors2.add("blue");
		
		System.out.println("colors : "+ colors);
		
		System.out.println("colors2 : "+ colors2);
		
		System.out.println("colors equals color2 ? : "+colors.equals(colors2));
	}
}
