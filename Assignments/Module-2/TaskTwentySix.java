package com.a247;

class Triangle
{
	int a,b,c,perimeter;
	
	double area;
	
	Triangle()
	{
		a=3;
		b=4;
		c=5;
	}
	
	void printArea()
	{
		int s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is : "+(area));
	}
	
	void printPerimeter()
	{
		System.out.println("Perimeter is : "+ (a+b+c));
	}
}

public class TaskTwentySix {
	public static void main(String[] asdf)
	{
		Triangle t = new Triangle();
		
		t.printArea();
		t.printPerimeter();
	}
}
