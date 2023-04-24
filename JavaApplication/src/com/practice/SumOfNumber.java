package com.practice;
import java.util.*;
public class SumOfNumber
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			if(b%2==0)
			{
				sum=sum+b;
			}
			a=a/10;
		}
		System.out.println(sum);
	}
}
