package com.Recursion.Code1;

import java.util.Scanner;

public class PerfectNumInRecursion {

	 int i=1;
	 int sum=0;
	public  int perfect(int num)
	{
		if(i>=num)return sum;
		else
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		perfect(num);
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int num=scn.nextInt();
		PerfectNumInRecursion p=new PerfectNumInRecursion();
		int result=p.perfect(num);
		if(result==num)System.out.println("Perfect");
		else System.out.println("not perfect");
	}

}
