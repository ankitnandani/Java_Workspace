package com.a287;

class SquareRectangle
{
	void area(int side)
	{
		System.out.println("Area of Square is : "+ (side*side));
	}
	
	void area(int len, int wid)
	{
		System.out.println("Area of Rectangle is : "+ (len*wid));
	}
}

public class TaskTwentyTwo {

	public static void main(String asdf[])
	{
		SquareRectangle s1 = new SquareRectangle();
		
		s1.area(5);
		s1.area(4,6);
	}
}
