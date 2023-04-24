package com.dn.constructOverride;

class Asso
{
	public void m1()
	{
		System.out.println("m1()");
	}
}
class Asson
{
	public void m2()
	{
		Asso a=new Asso();
		a.m1();
		System.out.println("m2()");
	}
}
public class Associatio1
{
	public static void main(String[] args)
	{
		Asson a1=new Asson();
		a1.m2();
	}
}
