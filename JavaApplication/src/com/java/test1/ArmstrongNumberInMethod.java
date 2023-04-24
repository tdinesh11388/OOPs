package com.java.test1;
import java.util.*;
public class ArmstrongNumberInMethod 
{
	public static int length (int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
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
		while(num>0)
		{
			int a=num%10;
			res=res+power(a,lenNum);
			num/=10;
		}
		return res;
	}
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a");
		int a=scn.nextInt();
		System.out.println("Enter b");
		int b=scn.nextInt();
		int c=0;
		for(int i=a;i<=b;i++)
		{
			c=Arm(i);
			if(c==i)System.out.println(i);
		}
	}
	
	
}
