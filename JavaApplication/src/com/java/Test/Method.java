package com.java.Test;
public class Method {
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		return fact;
	}
	public static int length(int num)
	{
		int len=0;
		for(;num>0;num/=10)
		{
			len++;
		}
		return len;
	}
	public static int power(int base,int exp)
	{
		int res=1;
		for(int i=1;i<=exp;i++)
		{
			res=res*base;
		}
		return res;
	}
	public static int Arm(int num)
	{
		int lenNum=length(num);
		int res=0;
		for(;num>0;num/=10)
		{
			int a=num%10;
			res=res+(power(a,lenNum));
		}
		return res;
	}
	public static int Strong(int num)
	{
		int res=0;
		for(;num>0;num/=10)
		{
			res=res+factorial(num%10);
		}
		return res;
	}
	public static int perfect(int num)
	{
		int res=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)res=res+i;
			
		}
		return res;
	}
	public static int prime(int num)
	{
		int count=0;
		if(num<=1)System.out.println("not a prime number");
		for(int i=2;i<num;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}
	public static int neon(int num)
	{
		int m=num*num;
		int res=0;
		for(;m>0;m/=10)
		{
			res=res+m%10;
		}
		return res;
	}
	public static int composite(int num)
	{
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}
	
}
