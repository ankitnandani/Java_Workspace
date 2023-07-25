package com.a247;

class Member
{
	String name,address;
	
	int age,phoneNumber;
	
	double salary;
	
	Member(String name,int age,int phoneNumber,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary()
	{
		System.out.println("Salary : "+ salary);
	}
}

public class TaskTwentyFour {

	public static void main(String asdf[])
	{
		Member m1 = new Member("Ankit",24,9999999,"Rajkot",50000.00);
		
		m1.printSalary();
	}
}
