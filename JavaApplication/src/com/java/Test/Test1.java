package com.java.Test;

public class Test1 {
	public static void love(int num)
	{
		if(num<=1000) {
			System.out.println("I Love java "+ num);
			love(num+1);
		}
	}
	public static void main(String[]args)
	{
		int a='d';
		for(int i=a;i>=0;i--)
		{
			System.out.println(i);
		}
	}
	
}
