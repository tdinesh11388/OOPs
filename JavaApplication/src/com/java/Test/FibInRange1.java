package com.java.Test;
import java.util.*;
public class FibInRange1
{
	public static int prime(int num)
	{
		int count=0;
		if(num<=1)return num;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int x=scn.nextInt();
		int y=scn.nextInt();
		int a=0,b=1,c=0;
		int alt=0;
		while(y>=a)
		{
			int r=0;
			if(x<=a) {
				alt++;
				if(alt%2==1)System.out.println(a);
			}
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

}
