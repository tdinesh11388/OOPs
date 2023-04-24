package com.dn.Abstract;

abstract class Test
{
	public static final void m1()
	{
		System.out.println("Test m1()");
	}
	public final void m2()
	{
		System.out.println("Test m2()");
	}

}
class Test1 extends Test
{
	
}
public class FinalConstant
{
	public static void main(String[] args)
	{
		Test t=new Test1();
		Test1 t1=(Test1)t;
		t1.m1();
		t1.m2();
	}
}
