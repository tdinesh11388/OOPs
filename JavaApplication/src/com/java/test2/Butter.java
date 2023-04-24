package com.java.test2;

import java.util.Scanner;

public class Butter
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int n=scn.nextInt();
		int str=1;
		int sp=n-1;
		/*for(int i=1;i<=a*2;i++)
		{
			for(int j=1;j<=str;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<a)
			{
				str++;
			}
			else {
				str--;
			}
		}*/
		for(int i=1;i<=n*2;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<n)
			{
				str++;
				sp--;
			}
			else {
				str--;
				sp++;
			}
		}
	}

}
