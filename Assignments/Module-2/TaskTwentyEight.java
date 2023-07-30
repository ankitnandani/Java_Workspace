package com.a287;

abstract class Parent
{
	abstract void message();
}

class FirstChild extends Parent
{
	void message()
	{
		System.out.println("This is first subclass.");
	}
}

class SecondChild extends Parent
{
	void message()
	{
		System.out.println("This is second subclass.");
	}
}

public class TaskTwentyEight {

	public static void main(String adsf[])
	{
		Parent p1;
		
		p1= new FirstChild();
		p1.message();
		
		p1=new SecondChild();
		p1.message();
	}
}
