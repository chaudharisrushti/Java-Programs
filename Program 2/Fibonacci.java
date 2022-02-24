//Write a java program to calculate Fibonacci Series up to n numbers.

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
class Fibonacci
{
	int c=0,i=0,j=1,next;
	void fib(int n)
	{
	if(n>0)
	{
	    if(c<=1)
	      next=c;
	    else
	    {
		next=i+j;
		i=j;
		j=next;
	    }
	    System.out.print(next+" ");
	    c++;
	    fib(--n);
	}
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of terms");
	int num=sc.nextInt();
	Fibonacci f=new Fibonacci();
	System.out.println("Fibonacci series is ");
	f.fib(num);
	}
}