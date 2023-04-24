package com.java.test1;
import java.util.*;
public class StrongNumberInMethod 
{
	public static int factorial(int num)
	{
		int a=1;
		int sum=0;
		while(num>0)
		{
			a=num%10;
			int res=1;
			for(int i=1;i<=a;i++)
			{
				res=res*i;
			}
		    sum=sum+res;
		    num/=10;
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number a");
		int a=scn.nextInt();
		System.out.println("Enter a number b");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int res=factorial(i);
			if(res==i)System.out.println(i);
		}
	}
	

}
