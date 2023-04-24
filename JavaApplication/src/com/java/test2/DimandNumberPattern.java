package com.java.test2;
import java.util.*;
public class DimandNumberPattern 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int n=scn.nextInt();
		int st=1;
		for(int i=1;i<=n;i++)
		{
			int num=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(num);
				if(k<=st/2)
				{
					num=num+1;
				}
				else {
					num=num-1;
				}
			}
			System.out.println();
			st+=2;
		}
	}

}
