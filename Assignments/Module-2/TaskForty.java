package com.a028;

public class TaskForty {

	static void withdraw(int balance, int amt) throws CustomEx
	{
		if(amt<=balance)
		{
			System.out.println("Withdraw Successful. Balance : "+ (balance-amt));
		}
		else
		{
			System.out.println("Insufficient Balance . Need "+(amt-balance)+" to perform action.");
			throw new CustomEx("Insufficient balance error.");
		}
	}
	
	public static void main(String asdf[])
	{
		try
		{
			withdraw(2000,2500);
		}
		catch(CustomEx e)
		{
			e.printStackTrace();
		}
	}
}
