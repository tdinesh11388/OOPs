package com.java.test1;
import java.util.*;
public class RangeOfPalindrome {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a value");
		int a =scn.nextInt();
		System.out.println("Enter b value");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int rev=0;
			int z=i;
			while(z>0)
			{
				rev=rev*10+z%10;
				z=z/10;
			}
			if(rev==i)System.out.println(i);
		}

	}

}
