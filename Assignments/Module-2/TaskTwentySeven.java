package com.a287;

import java.util.Scanner;

class Complex
{
	double real,imaginary;
	
	Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	Complex add(Complex a , Complex b)
	{
		Complex temp = new Complex((a.real+b.real),(a.imaginary+b.imaginary));
		
		return temp;
	}
	
	Complex deduct(Complex a , Complex b)
	{
		Complex temp = new Complex((a.real-b.real),(a.imaginary-b.imaginary));
		
		return temp;
	}
	Complex product(Complex a , Complex b)
	{
		Complex temp = new Complex((a.real*b.real-a.imaginary*b.imaginary),(a.real*b.imaginary+a.imaginary*b.real));
		
		return temp;
	}
	
	void printComplexNumber(Complex temp)
	{
		System.out.println(temp.real + " + "+temp.imaginary+"i ");
	}
}

public class TaskTwentySeven {

	public static void main(String adsf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter real part of number 1 : ");
		double a = s.nextDouble();
		
		System.out.println("Enter imaginary part of number 1 : ");
		double b = s.nextDouble();
		
		System.out.println("Enter real part of number 2 : ");
		double c = s.nextDouble();
		
		System.out.println("Enter imaginary part of number 2 : ");
		double d = s.nextDouble();
		
		Complex c1 = new Complex(a,b);
		Complex c2 = new Complex(c,d);
		
		Complex temp;
		
		temp = c1.add(c1,c2);
		System.out.println("\n\nAddition: ");
		c1.printComplexNumber(temp);

		temp = c1.deduct(c1,c2);
		System.out.println("\n\nDeduction: ");
		c1.printComplexNumber(temp);
		
		temp = c1.product(c1,c2);
		System.out.println("\n\nMultiplication: ");
		c1.printComplexNumber(temp);


		
		
		
		s.close(); 
	}
}
