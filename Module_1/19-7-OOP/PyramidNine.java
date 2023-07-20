package com.a197;

public class PyramidNine {

	public static void main(String asdf[])
	{

		for(int i=1;i<=5;i++)
		{
			for(int k=(5-i);k>=0;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{

				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
