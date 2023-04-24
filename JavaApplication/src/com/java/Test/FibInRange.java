package com.java.Test;

import java.util.Scanner;

public class FibInRange 
{

	public static int fib(int num)
	{
		if(num<=1)return num;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int a=0,b=1,c;
		int count=0;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			int r=fib(a);
			if(r==0)
			{
				sum++;
				if(sum%2==1)System.out.println(a);
			}
		}
		
	}

}
