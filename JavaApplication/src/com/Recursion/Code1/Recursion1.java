package com.Recursion.Code1;
import java.util.*;
public class Recursion1 
{
	static int factorial(int n)
	{
		int sum;
		if(n==0||n==1)return 1;
		sum= n*factorial(n-1);
		return sum;
	}
	static int sum=0;
	static int display(int n)
	{
		if(n>0)
		{
			int r=n%10;
			int fact=1;
			fact=factorial(r);
			sum=sum+fact;
			display(n/10);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Etner nubmer");
		int n=scn.nextInt();
		int r=display(n);
		if(r==n)System.out.println("Srong Number");
		else System.out.println("Not a Strong Number");
		
	}
}