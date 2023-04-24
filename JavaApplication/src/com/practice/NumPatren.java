package com.practice;

import java.util.Scanner;

public class NumPatren
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int n=scn.nextInt();
		int st=1;
		int num=1;
		int sp=n-1;
		for(int i=1;i<=n;i++)
		{
			num=1;
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(num);
				if(j<=st/2)num++;
				else num--;
			}
			System.out.println();
			sp--;
			st+=2;
		}
	}

}
