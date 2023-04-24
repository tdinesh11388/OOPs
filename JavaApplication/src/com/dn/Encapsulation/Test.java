package com.dn.Encapsulation;

class A 
{
	 int i=40;
	private A()
	{
		System.out.println(i);
	}
	public static A getInstance()
	{
		return new A();
	}
}
public class Test
{
	public static void main(String[] args)
	{
		A a=A.getInstance();
		a.i=90;
		System.out.println(a.i);
	}

}
