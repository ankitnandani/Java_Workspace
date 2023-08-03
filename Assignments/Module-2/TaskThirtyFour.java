package com.a028;

public class TaskThirtyFour {

	public static void main(String asdf[])
	{
		try
		{
			int data = 10/0;
			System.out.println(data);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("success");
		}
	}
}
