package com.a317;

abstract class Marks
{
	abstract double getPercentage();
}

class A extends Marks
{
	double a,b,c;
	
	A(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	double getPercentage()
	{
		return (a+b+c)/3.0;
	}
}

class B extends Marks
{
	double a,b,c,d;
	
	B(double a, double b, double c,double d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	double getPercentage()
	{
		return (a+b+c+d)/4.0;
	}
}

public class TaskThirty {
	public static void main(String asdf[])
	{
		Marks m;
		
		m=new A(80.0,95.0,79.0);
		System.out.println("Percentage of A : "+m.getPercentage());
		
		m=new B(80.0,95.0,79.0,85.0);
		System.out.println("Percentage of B : "+m.getPercentage());
	}
}
