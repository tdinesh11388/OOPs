package com.java.test1;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=scn.nextInt();
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0) count=count+i;
		}
		if(count==num)System.out.println("perfect Number");
		else System.out.println("not a perfect number");
	

	}

}
