package com.a287;

class Rectangle
{
	int length,breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void printArea()
	{
		System.out.println("Area is : "+(length*breadth));
	}
	
	void printPeri()
	{
		System.out.println("Perimeter is : "+(2*(length+breadth)));
	}
}

class Square extends Rectangle
{

	Square(int side)
	{
		super(side,side);
	}
	
}
public class TaskTwentyFive {

	public static void main(String asdf[])
	{
		Rectangle r1 = new Rectangle(3,4);
		Square s1 = new Square(5);
		
		System.out.println("RECTANGLE : ");
		r1.printArea();
		r1.printPeri();
		System.out.println("\n\nSQUARE : ");
		s1.printArea();
		s1.printPeri();
	}
}
