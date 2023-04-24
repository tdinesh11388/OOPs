package com.java.Test;
import java.util.*;
public class Fibinacii 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter equal number");
		int n=scn.nextInt();
		int a=0,b=1,c;
		for(;;)
		{
			c=a+b;
			if(c==n)
			{
				System.out.println("Fibnacii");
				break;
			}
			if(c>n)
			{
				System.out.println("not fibnacii");
				break;
			}
			a=b;
			b=c;
		}
	}
		
}


