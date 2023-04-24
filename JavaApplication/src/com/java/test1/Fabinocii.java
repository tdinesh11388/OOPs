package com.java.test1;
import java.util.*;
public class Fabinocii 
{
	public static void fibinacii(int n)
	{
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int n=scn.nextInt();
		fibinacii(n);
	}
}
