package com.Recursion.Code1;

import java.util.Scanner;
//Reverse Nubmer//
public class ReverseOfRecursion1 
{
	static int rev=0;
	public static int display(int n)
	{
		 if(n>0)
		 {
			  rev=rev*10+n%10;
			 display(n/10);
		 }
		 return rev;
		 
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int n=scn.nextInt();
			int r=display(n);
			System.out.println(r);
	}
}
