package com.Upcasting;
import com.Super.*;
class A extends O
{
	@Override
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}

}
class B extends O
{
	@Override
	public void m1()
	{
		System.out.println("b of m1()");
	}
	public void m2()
	{
		System.out.println("B of m2");
	}
	public void m3()
	{
		System.out.println("B of m3");
	}
}
public class Test1
{
	public static void main(String[] args)
	{
		O o=new B();
		A a=(A)o;
		B b=(B)o;
		o.m1();

		
	}

}
