package com.java.Test;
import java.util.*;
public class BND 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		int dec=0;
		while(n>0)
		{
			int bit=n%10;
			dec=bit*i+dec;
			i*=2;
			n=n/10;
		}
		System.out.println(dec);
	}

}
