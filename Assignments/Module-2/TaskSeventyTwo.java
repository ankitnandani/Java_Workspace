package com.a118;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskSeventyTwo {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String >();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		Iterator<String> i = colors.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
