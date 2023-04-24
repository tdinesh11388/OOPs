package com.dn.Abstraction;

abstract class Test1
{
	int i;
	static int j;
	final int k;
	final static int l;
	{
		k=12;
		System.out.println(k);
	}
	static
	{
		l=34;
		System.out.println(l);
	}
	public Test1(int i)
	{
		this.i=i;
		this.j=i;
	}
	public final  void m1()
	{
		System.out.println(i);
	}
	public final static void m2()
	{
		System.out.println(j);
	}
}
class Test2 extends Test1
{
	public Test2(int i)
	{
		super(i);
	}
}
public class Test {

	public static void main(String[] args) {
		Test1 t=new Test2(10);
		t.m1();
		t.m2();
	}

}
