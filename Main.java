/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		for(int i =0; i<3; i++)
		{
		    for(int j=3-i;j<3;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=5-(i*2);k>0;k--)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i = 1; i<3;i++)
		{
		    for(int j=2-i;j>0;j--)
		    {
		        System.out.print(" ");
		    }
		    for(int k=5-(i*2);k<=5;k++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
