package com.java.Test;

import java.util.Scanner;

public class AlternateFib 
{

	public static void fib(int n)
	{
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			if(c<=1)continue;
			for(int j=2;j<c;j++)
			{
				int count=0;
				if(c%j==0)
				{
					count++;
				}
				if(count==0)System.out.println(c);
			}
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fib(n);

	}

}
