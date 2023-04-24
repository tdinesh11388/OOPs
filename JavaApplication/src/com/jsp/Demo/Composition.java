package com.jsp.Demo;

class A
{
	public void m1()
	{
		System.out.println("a class");
	}
}
class B
{
	A a;
	public B(A a2)
	{
		a=new A();
	}
	public void m2()
	{
		System.out.println("b class");
	}
	public void m3()
	{
		a.m1();
	}
}
public class Composition
{
	public static void main(String[] args)
	{
		B b=new B(new A());
		b.m2();
		b.m3();
	}

}
