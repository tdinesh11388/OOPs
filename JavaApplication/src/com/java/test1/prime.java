package com.java.test1;
import java.util.*;
public class prime {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=scn.nextInt();
		if(num<=1) System.out.println("not a prime number");
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0) count++;
		}
		if(count==0)System.out.println("prime number");
		else System.out.println("not a prime nubmer");

	}

}
