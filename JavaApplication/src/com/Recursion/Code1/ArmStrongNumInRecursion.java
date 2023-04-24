package com.Recursion.Code1;

import java.util.Scanner;

public class ArmStrongNumInRecursion
{
	/*static int len=0;
	public  static int length(int num)
	{
		if(num==0) return len;
		length(num/10);len++;
		return len;
	}*/
	static int c=0;
	static int res=0;
	public static int power(int a,int b)
	{
		c=b;
		if(c==0)return res;
		 res=a*b;c--; power(a,c);
		 return res;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int num=scn.nextInt();
		int a=scn.nextInt();
		int result=power(num,a);
		System.out.println(result);
		//int result=length(num);
		//System.out.println(len);
	}

}
