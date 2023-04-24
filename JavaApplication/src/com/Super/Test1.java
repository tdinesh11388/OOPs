package com.Super;
class T
{
	public final void m1()
	{
		System.out.println("m1 method");
	}
}
class Y extends T
{
	public final void m2()
	{
		
		System.out.println("m2 method");
	}
}
public class Test1
{
	public static void main(String[] args)
	{
		T a=new T();
		
		a.m1();
		a.m2();
	}

}
