package com.java.test1;
import java.util.*;
public class Test1 
{
	public static int length(int n)
	{
		int len=0;
		while(n>0)
		{
			len++;
			n=n/10;
		}
		return len;
	}
	public static int power(int base,int exp)
	{
		int sum=1;
		for(int i=1;i<=exp;i++)
		{
			sum=sum*base;
		}
		return sum;
	}
	public static int Arm(int n)
	{
		int lenNum=length(n);
		int res=0;
		while(n>0)
		{
			res=res+power(n%10,lenNum);
			n=n/10;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x=Arm(i);
			if(x==i)System.out.println(i);
		}
		
	}
}
