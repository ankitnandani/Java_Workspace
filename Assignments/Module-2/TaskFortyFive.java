package com.a078;

class A1 extends Thread
{
	@Override
	public void run() {
		//super.run();
		for(int i=1;i<=10;i++)
		{
			System.out.println("A1 : "+i);
		}
		
	}
}

public class TaskFortyFive {

	public static void main(String asdf[])
	{
		A1 a = new A1();
		A1 a1 = new A1();
		
		a.start();
		a1.start();
	}
}
