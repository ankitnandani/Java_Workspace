package com.a048;

class Student
{
	int rollNo, age;
	String name,course;
	
	
	
	Student(int rollNo, String name, int age, String course) throws AgeNotValidEx,NameNotValidEx
	{
		this.rollNo=rollNo;
		
		if(!isAlpha(name))
		{
			throw new NameNotValidEx("Name is not valid.");
		}
		else
		{
			this.name=name;			
		}
		
		
		if(age < 15 || age>21)
		{
			throw new AgeNotValidEx("Age is not of student");
		}
		else
		{
			this.age=age;			
		}
		this.course=course;
	}
	
	 boolean isAlpha(String name) {
	    char[] chars = name.toCharArray();

	    for (char c : chars) {
	        if(!Character.isLetter(c)) {
	            return false;
	        }
	    }

	    return true;
	}
}

public class TaskFortyOne {

	public static void main(String asdf[])
	{
		try 
		{
			//Student s1=new Student(101,"@nkit",21,"computerScience");
			Student s2=new Student(102,"Ankit",24,"computerScience");
		} 
		catch (AgeNotValidEx e) 
		{
			e.printStackTrace();
		} 
		catch (NameNotValidEx e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
}
