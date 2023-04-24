package com.java.test2;
import java.util.*;
public class TrianglesPatterns 
{

	public static void m1(int n) 
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void hellowM1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==n)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void m2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void hellowM2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1||k==i||i==n)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void m3(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void hellowM3(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==n||j==i||j==1)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void m4(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void hellowM4(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==n||k==1||k==i)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		m1(n);
		hellowM1(n);
		m2(n);
		hellowM2(n);
		m3(n);
		hellowM3(n);
		m4(n);
		hellowM4(n);
		
	}

}
