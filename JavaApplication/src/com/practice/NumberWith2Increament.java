package com.practice;

import java.util.Scanner;

public class NumberWith2Increament
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter nubmer");
		int num=scn.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+i);
			}
			System.out.println();
		}
		
	}

}
