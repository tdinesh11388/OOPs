package com.java.test1;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scn.nextInt();
		int bin=0;
		int i=1;
		while(num>0)
		{
			int bit=num%2;
			bin=bit*i+bin;
			num/=2;
			i=i*10;
			
		}
		System.out.println(bin);
	}

}
