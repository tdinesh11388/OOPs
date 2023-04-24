package com.java.Test;

import java.util.Scanner;

public class PrintSumOfPrimeNumbers {

	public static void main(String[] args) {
		
			Scanner scn=new Scanner(System.in);
			System.out.print("Enter a Number a=");
			int a=scn.nextInt();
			System.out.print("Enter a Number b=");
			int b=scn.nextInt();
			int sum=0;
			int notPrime=0;
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
					sum=sum+i;
					//System.out.println(i);//
				}
				else {
					notPrime=notPrime+i;
				
				}
			}
			
			System.out.println(sum);
			System.out.println(notPrime);
			
			
			
			
			
			
		}
	

}
