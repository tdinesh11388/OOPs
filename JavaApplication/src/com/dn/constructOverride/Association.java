package com.dn.constructOverride;

class AIN
{
	public void m1()
	{
		System.out.println("m1() of AIN");
	}
	public void m2()
	{
		System.out.println("m2 of AIN");
	}
	public void m3()
	{
		System.out.println("m3 of AIN");
	}
}
class BIN extends AIN
{
	@Override
	public void m1()
	{
		System.out.println("m1() of BIN");
	}
	@Override
	public void m2()
	{
		System.out.println("m2() of BIN");
	}
}
public class Association 
{
	public static void main(String[] args)
	{
		BIN b=new BIN();
		b.m1();
		b.m2();
		b.m3();
	}
}