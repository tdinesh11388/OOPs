package com.Recursion.Code1;
import java.util.*;
public class RecursionPerfect 
{
	static int i=1;
	static int sum=0;
	public static int display(int n)
	{
		if(i>=n)return sum;
		else 
		{
			if(n%i==0) 
			{
				sum=sum+i;
			}
			i++;
			display(n);
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int re=display(n);
		if(re==n)System.out.println("Perfect Nubmer");
		else System.out.println("Not a perfect number");
		

	}

}
