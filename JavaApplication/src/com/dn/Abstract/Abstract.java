package com.dn.Abstract;

abstract class  A
{
	public abstract void m1();
	public abstract void m2();
	public void m3()
	{
		System.out.println("m3()");
	}
	public void m5()
	{
		System.out.println("m5");
	}
	public void m6()
	{
		System.out.println("m6() of A");
	}
}
class B extends A
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
	public void m4()
	{
		System.out.println("m4");
	}
	@Override
	public void m6()
	{
		System.out.println("m6 of B");
	}
}
public class Abstract
{
	public static void main(String[] args)
	{
		A a=new B();
		a.m1();
		a.m2();
		a.m3();
		B b=(B)a;
		b.m4();
		b.m5();
		b.m6();
	}

}
