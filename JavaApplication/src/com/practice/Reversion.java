package com.practice;

import java.util.Scanner;

public class Reversion
{
	public static int m1(int num)
	{
		if(num==0)
			return 0;
		return (num%10 + m1(num/10));
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Number: ");
		int num=scn.nextInt();
		
		int re=m1(num);
		System.out.println(re);
	}
}
