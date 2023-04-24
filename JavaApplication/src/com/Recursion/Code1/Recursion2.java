package com.Recursion.Code1;
import java.util.*;
public class Recursion2 
{
	public static int factorial(int n)
	{
		if(n==1||n==0)return 1;
		int r=n*factorial(n-1);
		return r;
	}
	static int sum=0;
	public static int display(int n)
	{
		if(n>0)
		{
			int x=n%10;
			display(n/10);
			int y=factorial(x);
			sum=sum+y;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int n=scn.nextInt();
		int r=display(n);
		if(r==n)System.out.println("Strong Nubmer");
		else System.out.println("Not a Strong Nubmer");
	}

}
