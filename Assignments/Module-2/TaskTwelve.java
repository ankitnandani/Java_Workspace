package com.a267;

public class TaskTwelve {

	public static void main(String asdf[])
	{
		for(int i = 1 ; i<= 100 ; i++)
		{
			if(i%3 == 0)
			{
				System.out.println(i);
				continue;				
			}
			
			if(i%5 == 0)
			{
				System.out.println(i);
				continue;
			}
			
			if(i%15 == 0)
			{
				System.out.println(i);
				continue;
			}
		}
	}
}
