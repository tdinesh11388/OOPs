package com.practice;

import java.util.Scanner;

public class StrongNumberInRecursion {

	public int  factorial(int num)
	{
		if(num==1 || num==0)return 1;
		return num*factorial(num-1);
	}
	public int strong(int num)
	{
		if(num==0)return num;
		return factorial(num%10)+strong(num/10);
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int num=scn.nextInt();
		StrongNumberInRecursion s=new StrongNumberInRecursion();
		for(int i=1;i<=num;i++)
		{
			int result =s.strong(i);
			if(result==i)System.out.println(i);
		}
		//int result =s.strong(num);
		//if(result==num)System.out.println("Strong Number");
		//else System.out.println("Not a Strong nubmer");
	}

}
