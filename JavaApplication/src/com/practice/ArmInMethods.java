package com.practice;

import java.util.Scanner;

public class ArmInMethods
{
	public static int length(int num)
	{
		int len=0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		return len;
	}
	public static int power(int base,int exp)
	{
		int prod=1;
		for(int i=1;i<=exp;i++)
		{
			prod=prod*base;
		}
		return prod;
	}
	public static int arm(int num)
	{
		int res=0;

		int len=length(num);
		while(num>0)
		{
			int a=num%10;
			res=res+power(a,len);
			num=num/10;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int num=scn.nextInt();
		int result=arm(num);
		System.out.println(result);
		if(result==num)System.out.println("arm");
		else System.out.println("not arm");
	}

}
