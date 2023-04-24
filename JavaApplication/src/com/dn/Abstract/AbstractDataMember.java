package com.dn.Abstract;

 abstract class AA 
{
	 static int i=90;
	 int j=67;
	public abstract void m1();
	public void m3()
	{
		System.out.println(j);
	}
}
class BB extends AA
{
	public void m1()
	{
		System.out.println(i);
	}
	public void m2()
	{
		System.out.println(j);
	}
}
public abstract class AbstractDataMember
{
	
	static int i=8;
	int j=5;
	public static void main(String[] args)
	{
		AA a=new BB();
		a.m1();
		BB b=(BB)a;
		b.m2();
		b.m3();
		System.out.println(i);
	}
}