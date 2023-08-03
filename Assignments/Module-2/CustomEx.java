package com.a028;

public class CustomEx extends Exception
{
	CustomEx(String message)
	{
		super(message);
	}
	
	
	static void insufficientBalance()
	{
		System.out.println("Insufficient Balance error");
	}
	
	public static void main(String asdf[])
	{
		insufficientBalance();
	}
}
