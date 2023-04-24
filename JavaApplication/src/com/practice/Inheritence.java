package com.practice;

/*class Int
{
	int i=34;
	public void m1()
	{
		System.out.println(i);
	}
}
class Int1 extends Int
{
	int j=45;
	public void m1()
	{
		System.out.println(i);
	}
	public void m2()
	{
		System.out.println(j);
	}
}
interface implements Int1,Int
{
	public void m5()
	{
		System.out.println(i);
	}
}*/
@FunctionalInterface
interface Inter
{
	void m1();
	default void m2()
	{
		System.out.println("m2 of Inter");
	}
}
interface Inter1
{
	void m1();
}
class Test extends Object implements Inter,Inter1
{
	@Override
	public void m1()
	{
		System.out.println("Hello");
	}
}
public class Inheritence
{
	public static void main(String[] args)
	{
		Inter t=new Test();
		t.m1();
		t.m2();
	}

}
