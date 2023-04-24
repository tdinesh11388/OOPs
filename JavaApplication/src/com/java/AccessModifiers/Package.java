package com.java.AccessModifiers;

class Pack
{
	   int  i=9876;
	  void m1()
	{
		  Pack p3=new Pack();
		System.out.println(p3.i);
	}
}
public class Package 
{
	public static void main(String[] args)
	{
		Pack p=new Pack();
		Pack p1=new Pack();
		p.m1();
		p.i=56;
		p.m1();
		p1.i=78;
		System.out.println(p.i);
		System.out.println(p1.i);
		
		
	}
}
