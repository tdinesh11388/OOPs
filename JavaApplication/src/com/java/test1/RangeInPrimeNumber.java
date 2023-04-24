package com.java.test1;
import java.util.*;
public class RangeInPrimeNumber 
{
	public static int prime(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number a");
		int a=scn.nextInt();
		System.out.println("Enter nubmer b");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i<=1)continue;
			int res=prime(i);
			if(res==0)System.out.println(i);
		}
	}
	

}
