package com.practice;

import java.util.Scanner;

class Factorial1
{
	public int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class StrongNum extends Factorial1
{
	@Override
	public int factorial(int num)
	{
		if(num==0 || num==1) return 1;
		return num*factorial(num-1);
	}
	public int StrogNumber(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+factorial(num%10);
			num=num/10;
		}
		return sum;
	}
}
public class TestT
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer ");
		int num=scn.nextInt();
		StrongNum s=new StrongNum();
		int r=s.StrogNumber(num);
		if(r==num)System.out.println("Strong Nubmer");
		else System.out.println("Not strong Number");
		
	}

}
