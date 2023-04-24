package com.practice;

import java.util.Scanner;

public class ArmInRecursion1
{
	static int len=0;
	public static int length(int num)
	{
		if(num==0)return len;
		len++;
		length(num/10);
		return len;
	}
	static int prod=1;
	public static int power(int base,int exp)
	{
		int c=base;
		if(base==c && exp==0)return exp;
		return base*power(base,exp--);
	}
	static int sum=0;
	public static int arm(int num)
	{
		int len=length(num);
		if(num==0)return sum;
		sum=sum+power(num%10,len);
		arm(num/10);
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int result=arm(num);
		System.out.println(result);
		
	}

}
