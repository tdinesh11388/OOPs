package com.practice;
import java.util.*;
public class ArmStrong
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");	
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int sum=0;
			int num=i*i;
			while(num>0)
			{
				int x=num%10;
				sum=sum+x;
				num/=10;
			}
			if(sum==i)System.out.println(i);
		}
	}

}
