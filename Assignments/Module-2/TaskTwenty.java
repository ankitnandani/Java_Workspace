package com.a287;

class PrintNumber
{
	void printn(float a)
	{
		System.out.println("The number is : "+ a);
	}
	
	void printn(String a)
	{
		System.out.println("The number is : "+ a);	
	}
	
	void printn(double a)
	{
		System.out.println("The number is : "+ a);
	}
	
	void printn(int a)
	{
		System.out.println("The number is : "+ a);
	}
}

public class TaskTwenty {

	public static void main(String adsf[])
	{
		PrintNumber p1 = new PrintNumber();
		
		p1.printn(1);
		p1.printn(1.05);
		p1.printn("1");
		p1.printn(1.25f);
	}
}
