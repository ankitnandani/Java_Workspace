package com.a048;

class P1 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("P1 : "+i);
		}
	}
	
}

public class TaskFortyTwo {

	public static void main(String asdf[])
	{
		Thread t1 = new Thread(new P1());
		
		t1.start();
	}
}
