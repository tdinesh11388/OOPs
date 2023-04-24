package com.java.test1;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int n=num;
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			int fact=1;
			for(int i=1;i<=a;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==n)System.out.println("Strong number");
		else System.out.println("Not a Strong Number");

	}

}
