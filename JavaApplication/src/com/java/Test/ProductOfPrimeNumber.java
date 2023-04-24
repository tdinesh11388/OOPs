package com.java.Test;

import java.util.Scanner;

public class ProductOfPrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Number a=");
		int a=scn.nextInt();
		System.out.print("Enter a Number b=");
		int b=scn.nextInt();
		int prod=1;
		int notPrime=1;
		for(int i=a;i<=b;i++)
		{
			if(i<=1)continue;
			int count=0;
			for(int j=2;j<i;j++) 
			{
				if(i%j==0) {
					count++;break;
				}
			}
			if(count==0) {
				prod=prod*i;
				//System.out.println(i);//
			}
			else {
				notPrime=notPrime*i;
			
			}
		}
		
		System.out.println(prod);
		System.out.println(notPrime);
		

	}

}
