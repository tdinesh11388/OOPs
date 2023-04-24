package com.java.test2;
import java.util.*;
public class Butterfly1 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		int stars=1;
		int Lstars=n*2-1;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(j<=stars||j>=Lstars)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if(i<n)
			{
				stars++;
				Lstars--;
			}
			else {
				stars--;
				Lstars++;
			}
		}
	}
}