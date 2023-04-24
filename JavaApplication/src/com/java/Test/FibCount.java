package com.java.Test;
import java.util.*;
public class FibCount
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int n=scn.nextInt();
		int a=0,b=1,c=0;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			count++;
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(count);
	}

}
