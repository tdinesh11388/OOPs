package com.java.Test;
import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number a=");
		int a=scn.nextInt();
		System.out.print("Enter Number b=");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int n=i;
			int count=0;
			while(n>0)
			{
				count++;
				n=n/10;
			}
			n=i;
			int sum=0;
			while(n>0)
			{
				int d=n%10;
				int prod=1;
				for(int j=1;j<=count;j++)
				{
					prod=prod*d;
				}
				sum=sum+prod;
				n=n/10;
			}
			if(sum==i)System.out.println(i);
		}
		
	}

}
