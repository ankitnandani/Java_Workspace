package com.a287;

class PrintSequence
{
	void printItems(int a , char b)
	{
		System.out.println(a+" "+b);
	}
	
	void printItems(char a , int b)
	{
		System.out.println(a+" " + b);
	}
}

public class TaskTwentyOne {

	public static void main(String asdf[])
	{
		PrintSequence p1 = new PrintSequence();
		
		p1.printItems(2,'a');
		p1.printItems('a',1);
	}
}
