package com.practice;

class Lib
{
	static int count;
	private static Lib l=null;
	private Lib()
	{
		count++;
	}
	public static Lib getInstance1()
	{
		if(l==null)
		{
			l=new Lib();
		}
		return l;
	}
}
public class Library 
{
	public static void main(String[] args)
	{
		Lib l=Lib.getInstance1();
		Lib l1=Lib.getInstance1();
		Lib l2=Lib.getInstance1();
		Lib l3=Lib.getInstance1();
		System.out.println(Lib.count);
	}
}
