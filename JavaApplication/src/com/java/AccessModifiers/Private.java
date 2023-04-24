package com.java.AccessModifiers;
import com.java.AccessModifiers.Pack;

class Private1
{
	private int j=34;
	private void m1()
	{
		System.out.println("m1()");
		System.out.println(j);
	}
	private void m2()
	{
		System.out.println("m2()");
		m1();
	}
	public void m3()
	{
		System.out.println("m3()");
		m2();
	}
}
public class Private
{
	public static void main(String[] args) 
	{
		System.out.println("lkjhgf");
		Private1 p=new Private1();
		p.m3();
	}
}
