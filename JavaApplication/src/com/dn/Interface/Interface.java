package com.dn.Interface;

class A
{
	public void m1()
	{
		System.out.println("m1() of A");
	}
	public void m2()
	{
		System.out.println("m2() of A");
	}
	public void m3()
	{
		System.out.println("m3() of A");
	}
	public void m4()
	{
		System.out.println("m4() of A");
	}
}
class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("m1() of B");
	}
	@Override
	public void m2()
	{
		
		System.out.println("m2() of B");
	}
	@Override
	public void m3()
	{
		System.out.println("m3() of B");
	}
}
public class Interface
{

	public static void main(String[] args)
	{
		B b=new B();
		b.m1();
		b.m4();
	}

}
