package com.java.test2;
import java.util.*;
public class PyramidHellowPattern 
{	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				if(k==1||k==i*2-1||i==n)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
