package com.java.Test;
import java.util.*;
public class PrimeLargest 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int sum=0;
		int even=0;
		int odd=0;
		for(int i=b;i>=a;i--)
		{
			int count=0;
			if(i<=1)continue;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)count++;
			}
			if(count==0)
			{
				if(i%2==0)even+=i;
				else odd+=i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
