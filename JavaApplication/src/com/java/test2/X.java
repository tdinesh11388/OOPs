package com.java.test2;
import java.util.*;
public class X 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n||j==1||i==1||i==j||i+j==n+1||j==n)System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
