package com.Recursion.Code1;

import java.util.Scanner;

public class Fibnacii 
{
	static int a=0,b=1,c=0;
	static int alt=0;
	public static void fib(int num)
	{
		if(num>0)
		{
			c=a+b;alt++;
			//if(alt%2==1)
			System.out.println(a);
			
			a=b;
			b=c;
			fib(num-1);
		}
	}

	public static void main(String[] args) 
	{
		 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		fib(num);
	}

}
