package com.a028;

public class TaskThirtyNine {

	static void validate(int age) throws ArithmeticException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Age not valid");
		}
			
	}
	
	public static void main(String asdf[])
	{
		try
		{
			validate(21);
			validate(15);			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("End Program");
		}
	}
}
