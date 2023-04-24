package com.java.test1;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int n=num;
		int c=num;
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*a;
			}
			sum=sum+fact;
			n/=10;
		}
		if(sum==c)System.out.println("Armstrong number");
		else System.out.println("not a Armstring number");

	}

}
