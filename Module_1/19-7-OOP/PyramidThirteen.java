package com.a197;

public class PyramidThirteen {

	public static void main(String asdf[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
