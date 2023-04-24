package com.practice;

import java.util.Scanner;

public class AddFirstThree
{
	public static int rev(int num)
	{
		int rem=0;
		while(num>0)
		{
			rem=rem*10+num%10;
			num/=10;
		}
		int n=rem;
		System.out.println("reverse Value="+n);
		int sum=0;
		while(n>1000)
		{
			n=n/10;
			while(n>0 && n<1000)
			{
				int rem1=n%10;
				sum=sum+rem1;
				n=n/10;
			}
		}
		return sum;
	}
	public static int m2(int r)
	{
		if(r==0) return 0;
		return(r%10 + m2(r/10));
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int num=scn.nextInt();
		int r=rev(num);
		System.out.println(r);
		int result=m2(r);
		System.out.println(result);
		/*int sum=0;
		do {
			while(r>0)
			{
				sum=sum+r%10;
				r/=10;
			}
		}while(r>0);
		
		System.out.println(sum);*/
	}

}
