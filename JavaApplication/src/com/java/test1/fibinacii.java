package com.java.test1;
import java.util.*;
public class fibinacii {
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=scn.nextInt();
		int a=0;
		int b=1,c=0;
		for(;a<=num;)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
