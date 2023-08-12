package com.a118;

import java.util.HashMap;
import java.util.Scanner;

public class TaskSixtyNine {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "red");
		map.put(2, "green");
		map.put(3, "blue");
		
		
		System.out.println("Enter key to check in map : ");
		int a = s.nextInt();
		
		System.out.println("Answer : "+map.containsKey(a));
		
		s.close();
	}
}
