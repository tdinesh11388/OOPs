package com.Super;

class A 
{
	int i=78;
	public void m1()
	{
		System.out.println("oiuy");
	}
	public void m2()
	{
		System.out.println(i);
	}
}
class B extends A
{
	int j=4;
	@Override
	public void m1()
	{
		System.out.println(super.i);
		System.out.println("oiuyt");
	}
}
public class Over
{
	public static void main(String[] args)
	{
		B b=new B();
		b.m1();
		b.m2();
	}
}