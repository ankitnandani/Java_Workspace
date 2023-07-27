package com.a267;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskEleven {

	public static void main(String asdf[])
	{
		LocalDateTime obj = LocalDateTime.now();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Time is : "+ obj.format(format));
		
	}
}
