package com.java.Test;

import java.util.Scanner;

public class LCm
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int num=a*b;
		while(true)
		{
			if(num%a==0 && num%b==0)break;
			num=num++;
		}
		System.out.println(num);
		//System.out.println(num/num);

	}

}
