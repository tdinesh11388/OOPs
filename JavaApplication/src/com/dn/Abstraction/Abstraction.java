package com.dn.Abstraction;

abstract class A
{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public void m4()
	{
		System.out.println("M4 method");
	}
}
abstract class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("m1()");
	}
	@Override
	public void m2()
	{
		System.out.println("m2()");
	}
	public void m3()
	{
		System.out.println("m5()kjhgvc");
	}
}
class C extends B
{
	@Override
	public void m3()
	{
		System.out.println("m3()");
	}
}
public class Abstraction
{
	public static void main(String[] args)
	{
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
}
