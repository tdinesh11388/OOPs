package com.java.Test;
import java.util.Scanner;
class ArmStrongNumberRange
{

	public static void main(String[] args) 
	{		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int n=scn.nextInt();
		int z=n;
		int num=n;
		int len=0;
		while(n>0)
		{
			len++;
			n/=10;
		}
		int sum=0;
		while(num>0)
		{
			int x=num%10;
			int fact=1;
			for(int i=1;i<=len;i++)
			{
				fact=fact*x;
			}
			sum=sum+fact;
			num/=10;
		}
		if(sum==z)System.out.println("Arm");
		else System.out.println("not Arm");
	}
}

