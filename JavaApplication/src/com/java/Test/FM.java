package com.java.Test;
import java.util.*;
public class FM 
{

	public static void fib(int n)
	{
		int a=0,b=1,c=0;
		int len=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b; len++;
			if(len%2==1)
			{
				System.out.println(a);
			}
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
