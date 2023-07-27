package com.a267;

import java.util.Scanner;

public class TaskTen {

	public static void main(String adsf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input number : ");
		
		String str = s.next();
		
		int a = Integer.parseInt(str);
		
		String q=str+str;
		
		int b = Integer.parseInt(q);
		
		str=q+str;
		
		int c= Integer.parseInt(str);
		
		System.out.println(q.charAt(0)+" + "+q+" + "+str);
		System.out.println("Output : "+(a+b+c));
		
		
		
		
		
		
		s.close();
	}
}
