package com.a048;

class P2 implements Runnable
{

	@Override
	public void run() {
		
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("P2 : "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
	
}
class Q2 implements Runnable
{

	@Override
	public void run() {
		
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Q2 : "+i);
				Thread.sleep(2000);
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class TaskFortyFour {
	public static void main(String asdf[])
	{
		Thread t1 = new Thread(new P2());
		Thread t2 = new Thread(new Q2());
		
		t1.start();
		t2.start();

	}
}
