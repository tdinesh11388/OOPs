package com.java.test2;
import java.util.*;
public class NumberPattern 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int num=n;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=num;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			if(i>=n)
			{
				num++;
			}
			else {
				num--;
			}
		}

	}

}
