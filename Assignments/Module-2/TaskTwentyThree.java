package com.a247;

class Parent
{
	void displayResult()
	{
		System.out.println("This is a parent class.");
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("This is a child class");
	}
}


public class TaskTwentyThree {

	public static void main(String asdf[])
	{
		Parent p = new Parent();
		Child c = new Child();
		
		p.displayResult();
		c.display();
		c.displayResult();
	}
	
	
	
}
