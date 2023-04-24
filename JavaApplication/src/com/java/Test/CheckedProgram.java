package com.java.Test;
import java.util.*;
public class CheckedProgram 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0,b=1,c;
		int even=0;
		int odd=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			if(a%2==0)even=even+a;
			else odd=odd+a;
			
		}
		System.out.println("even="+even);
		System.out.println("odd="+odd);
	}

}
