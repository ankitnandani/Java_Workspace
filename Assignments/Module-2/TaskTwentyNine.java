package com.a317;

abstract class Bank
{
	double balance;
	abstract void getBalance();
}
class BankA extends Bank
{
	BankA(double balance)
	{
		this.balance = balance;
	}
	
	void getBalance()
	{
		System.out.println("Bank A Balance is : "+ balance);
	}
}

class BankB extends Bank
{
	BankB(double balance)
	{
		this.balance = balance;
	}
	
	void getBalance()
	{
		System.out.println("Bank B Balance is : "+ balance);
	}
}

class BankC extends Bank
{
	BankC(double balance)
	{
		this.balance = balance;
	}
	
	void getBalance()
	{
		System.out.println("Bank C Balance is : "+ balance);
	}
}

public class TaskTwentyNine {

	public static void main(String asdf[])
	{
		Bank b;
		
		b=new BankA(100.0);
		b.getBalance();
		
		b=new BankB(150.0);
		b.getBalance();
		
		b=new BankC(200.0);
		b.getBalance();
	}
}
