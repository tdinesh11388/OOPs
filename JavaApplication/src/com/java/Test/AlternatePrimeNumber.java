package com.java.Test;

import java.util.Scanner;

public class AlternatePrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Number a=");
		int a=scn.nextInt();
		System.out.print("Enter a Number b=");
		int b=scn.nextInt();
		int count=0;
		for(int i=a;i<=b;i++)
		{
			if(i<=1)continue;
			int sum=0;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) {
					sum++;break;
				}
			}
			if(sum==0) 
			{
				count++;
				if(count%2==1) System.out.println(i);
			}
		}
		
		
	}

}
