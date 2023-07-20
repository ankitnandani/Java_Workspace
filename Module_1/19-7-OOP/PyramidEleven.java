package com.a197;

public class PyramidEleven {

	public static void main(String asdf[])
	{
		boolean flag = true;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(flag)
					System.out.print("1");
				else
					System.out.print("0");
				
				flag=!flag;
			}
			System.out.println();
		}
	}
}
