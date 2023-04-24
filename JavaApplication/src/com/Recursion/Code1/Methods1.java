package com.Recursion.Code1;
import java.util.*;
public class Methods1 {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a and b ");
		int a=scn.nextInt();
		int b=scn.nextInt();
		HCF(a,b);
	}
	public static void HCF(int a, int b)
	{
		int HCF=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			{
				HCF=i;
			}
		}
		System.out.println(HCF);
	}
		public static void m1(int a,int b)
		{
			int LCM=0;
			int num=a>b? a:b;
			while(true)
			{
				if(num%a==0&&num%b==0)
				{
					System.out.println(num);
					break;
				}
				num++;
			}
		}

	

}
