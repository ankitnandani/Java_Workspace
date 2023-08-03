package com.a028;

class Shape
{
	void print(int toggle)
	{
		System.out.println("This is a shape.");
	}
}

class Rectangle extends Shape
{
	void print(int toggle)
	{
		if(toggle == 2)
		{
			System.out.println("This is a rectangle.");			
		}
		else
		{
			super.print(toggle);
		}
	}
}

class Circle extends Shape
{
	void print(int toggle)
	{
		if(toggle == 2)
		{
			System.out.println("This is a circle.");			
		}
		else
		{
			super.print(toggle);
		}
	}
}

class Square extends Rectangle
{
	void print(int toggle)
	{
		if(toggle == 1)
		{
			System.out.println("Square is a rectangle.");
		}
		else
		{
			super.print(toggle);
		}
		
	}
}

public class TaskThirtyThree {

	public static void main(String asdf[])
	{
		Square s1 = new Square();
		
		s1.print(2);
		s1.print(3);

	}
}
