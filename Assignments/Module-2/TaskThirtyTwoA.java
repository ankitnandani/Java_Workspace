package com.a317;

abstract class Shape
{
	abstract double rectangleArea(double len, double wid);
	
	abstract double squareArea(double side);
	
	abstract double circleArea(double radius);
}

class Area extends Shape
{

	@Override
	double rectangleArea(double len, double wid) {
		// TODO Auto-generated method stub
		return len*wid;
	}

	@Override
	double squareArea(double side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	double circleArea(double radius) {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	
}

public class TaskThirtyTwoA {
	public static void main(String asdf[])
	{
		Area a1=new Area();
		
		System.out.println("Area of Rectangle : "+(a1.rectangleArea(3.0, 4.0)));
		System.out.println("Area of Square : "+(a1.squareArea(5.0)));
		System.out.println("Area of Circle : "+(a1.circleArea(3.0)));
		
		
	}
}
