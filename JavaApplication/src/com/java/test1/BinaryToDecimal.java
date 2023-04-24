package com.java.test1;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Nubmer");
		int num=scn.nextInt();
		int dec=0;
		int i=1;
		while(num>0)
		{
			int bit=num%10;
			dec=bit*i+dec;
			i=i*2;
			num/=10;
			
		}
		System.out.println(dec);

	}

}
