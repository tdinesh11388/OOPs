package com.practice;

import java.util.Scanner;

class Test5
{
	public int display(int n,int m)
	{
		int even=0;
		int odd=0;
		int dif=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				even=even+i;
			}
			else {
				odd=odd+i;
			}
			dif=odd-even;
		}
		return dif;
	}
}
public class AccentureCodingQuestion
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number n and m");
		int n=scn.nextInt();
		int m=scn.nextInt();
		Test5 t=new Test5();
		int r=t.display(n,m);
		System.out.println(r);
	}

}
