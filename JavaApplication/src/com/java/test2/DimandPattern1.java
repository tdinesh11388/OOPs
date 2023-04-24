package com.java.test2;

import java.util.*;

public class DimandPattern1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		int space=n/2;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				if(k==1||k==stars) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2)
			{
				space--;
				stars+=2;
			}
			else {
				space++;
				stars-=2;
			}
		}

	}


}
