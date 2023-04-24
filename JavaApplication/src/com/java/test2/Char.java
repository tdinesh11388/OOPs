package com.java.test2;
import java.util.*;
public class Char
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=scn.nextInt();
		for(int i=1;i<=n*2;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||j==n||i==n*2||i==n) System.out.print("8 ");
				else System.out.print("  ");
			}
			System.out.println();
		}

	}

}
